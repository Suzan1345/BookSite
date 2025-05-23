<template>
  <div>
    <ul>
      <li v-for="(book, index) in books" :key="index">
        {{ book.title }} von {{ book.author }}
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: 'BookList',
  props: {
    books: Array
  }
}
</script>
