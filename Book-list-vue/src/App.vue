<template>
  <div>
    <h1>Meine Bücher</h1>
    <BookList :books="bookList" />
  </div>
</template>

<script>
import BookList from './components/BookList.vue';

export default {
  name: 'App',
  components: {
    BookList
  },
  data() {
    return {
      bookList: [
        { title: 'Der Hobbit', author: 'J.R.R. Tolkien' },
        { title: 'normal people', author: 'Sally Rooney' },
        { title: 'Circe', author: 'Madeline Miller' }
      ]
    };
  }
}
</script>
