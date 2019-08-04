<template>
    <div id="home" class="page">
        <b-container>
            <form class="">
                <input @keyup.enter="addTodo" type="text" name="" value="" />
            </form>
        </b-container>
    </div>
</template>

<script lang="ts">
import Vue from 'vue';
import axios from 'axios';
import { serverName } from '@/serverName';

export default Vue.extend({
    data() {
        return {
            todos: [],
        };
    },
    created() {
        axios
            .get(serverName + '/todo')
            .then((response) => {
                this.todos = response.data;
            })
            .catch();
    },
    methods: {
        addTodo() {
            axios.post(serverName + 'todo', {
                task: 'asdasd',
                done: false,
            });
        },
    },
});
</script>
