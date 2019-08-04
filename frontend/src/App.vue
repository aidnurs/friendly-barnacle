<template>
    <div id="app">
        <Navbar />
        <router-view />
    </div>
</template>

<script>
import Vue from 'vue';
import Navbar from '@/components/Navbar';

export default Vue.extend({
    components: { Navbar },
});
</script>

<style lang="scss" src="@/assets/styles/style.scss"></style>
