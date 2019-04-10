package todoList.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    private Integer id;
    private String title;
    private String comments;

    public Task() {
    }

    public Task(Integer id, String title, String comments) {
        this.title = title;
        this.comments = comments;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(nullable = false)
    public String getTitle() {
        return title;
    }

    @Column(columnDefinition = "text", nullable = false)
    public String getComments() {
        return comments;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}

