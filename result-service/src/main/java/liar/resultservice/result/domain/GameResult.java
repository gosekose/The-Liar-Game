package liar.resultservice.result.domain;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.concurrent.atomic.AtomicLong;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Table(indexes = {
        @Index(name = "game_result_game_id_index", columnList = "game_id")
})
public class GameResult extends BaseEntity {

    @Id @GeneratedValue
    @Column(name = "game_result_id")
    private AtomicLong id;

    private String gameId;
    private String roomId;
    private String hostId;
    private String topicId;
    private String gameName;
    private GameRole winner;
    private int totalUsers;

}
