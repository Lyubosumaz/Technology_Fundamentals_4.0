package meisterTask.entities;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    private Integer id;
    private String title;
    private String status;

    public Task() {
    }

    public Task(String title, String status) {
        this.title = title;
        this.status = status;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer getId() {
        return id;
    }

    @Column(name = "title", nullable = false)
    public String getTitle() {
        return this.title;
    }

    @Column(name = "status", nullable = false)
    public String getStatus() {
        return this.status;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
