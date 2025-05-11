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
        { title: '1984', author: 'George Orwell' },
        { title: 'Brave New World', author: 'Aldous Huxley' }
      ]
    };
  }
}
</script>
