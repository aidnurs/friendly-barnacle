<template>
    <div class="home">
        <img alt="Vue logo" src="../assets/logo.png" />
        <div class="">
            asldaskdn
        </div>
    </div>
</template>

<script lang="ts">
import Vue from 'vue';
import axios from 'axios';
import { serverName } from '@/serverName';

export default Vue.extend({
    created() {
        console.log(serverName);
        axios
            .get(serverName + '/todo')
            .then((response) => {
                console.log(response);
            })
            .catch();
    },
});
</script>
