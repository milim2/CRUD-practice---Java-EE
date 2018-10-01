# CRUD-practice : Java-EE

> Create a global (Note this global is THREAD SAFE!) CopyOnWriteArrayList.
```
List<Person> personList = new CopyOnWriteArrayList<Person>();

>To iterate through the list, use for each loop
```
for(Person person : personList) {
response.getWriter().append(“<h3>” + person.toString() + “</h3>”);
}

