<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <!-- <div>
    <h4>{{ product1 }}</h4>
    <p>{{ price1 }}원</p>
  </div>
  <div>
    <h4>{{ product2 }}</h4>
    <p :style="styleR">{{ price2 }}원</p> style앞에 : 붙이면 vue문법을 사용하겠다는 뜻
  </div> -->
  <!-- v-for="(item, index) in items" :key="index" -->
  <div v-for="item in products" :key="item">
  <!-- <div v-for="(item, i) in products" :key="i"> -->
    <!-- {{ i }} -->
    <!-- <h4 v-for="name in products" :key="name">{{ name }}</h4> -->
    <!-- <h4 v-for="(name, i) in products" :key="i">{{ i }}</h4> -->
    <h4>{{ item.name }}</h4>
    <p>{{ item.price }}원</p>
  </div>
</template>

<script>
export default {
  name: 'App',
  data() { // 데이터 바인딩
    return {
      products: [
        {name: '티셔츠', price: '38,000'}
        ,{name: '바지', price: '50,000'}
        ,{name: '점퍼', price: '78,900'}
      ],
      product1: '양말',
      price1: '3,800',
      product2: '폰케이스',
      price2: '24,000',
      styleR: 'color:red',// 데이터 바인딩은 데이터를 넣을때만 쓰는 것이 아니다!
    }
  },
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
