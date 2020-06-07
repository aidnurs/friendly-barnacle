package hello;

import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path="/todo")
@CrossOrigin(origins = "http://localhost:8080")
public class TodoController {
    @Autowired // This means to get the bean called userRepository
    // Which is auto-generated by Spring, we will use it to handle the data
    private TodoRepository todoRepository;

    /*
    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
        String.format(template, name));
    }
    */
    @GetMapping
    public Iterable<Todo> getAllTodos(){
        return todoRepository.findAll();
    }

    @GetMapping(path="/get")
    public Optional<Todo> getTodoById(@RequestParam Integer id){
        return todoRepository.findById(id);
    }

    @PostMapping
    public Todo addTodo(@RequestBody Todo newTodo){
        return todoRepository.save(newTodo);
    }

    @DeleteMapping
    public void deleteGreetingById(@RequestParam Integer id){
        todoRepository.deleteById(id);
    }

}