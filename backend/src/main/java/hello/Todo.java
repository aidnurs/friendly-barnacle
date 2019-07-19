package hello;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String task;
    private Boolean done;

    public Todo(){

    }

    public Todo(Integer id, String task, Boolean done) {
        this.id = id;
        this.task = task;
        this.done=done;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTask() {
        return task;
    }

    public void setTask(String task){
      this.task=task;
    }

    public boolean getDone(){
      return done;
    }

    public void setDone(Boolean done){
      this.done=done;
    }

}
