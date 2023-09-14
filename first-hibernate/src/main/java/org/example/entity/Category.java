package org.example.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "category", schema = "todolist", catalog = "postgres")
@EqualsAndHashCode
@ToString
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Category {

    private String title;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private Long id;
    private Long userId;
    @Column(updatable = false)
    private Long completedCount;
    @Column(updatable = false)
    private Long uncompletedCount;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id", insertable=false, updatable=false)
    private User user;


}
