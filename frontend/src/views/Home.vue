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
import { serverName } from '@/settings';

export default Vue.extend({
    created() {
        console.log(serverName);
        axios
            .get(serverName + '/greeting')
            .then((response) => {
                console.log(response);
            })
            .catch();
    },
});
</script>
