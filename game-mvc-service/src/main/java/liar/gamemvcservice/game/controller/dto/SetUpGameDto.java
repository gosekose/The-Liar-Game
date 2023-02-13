package liar.gamemvcservice.game.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.List;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class SetUpGameDto {
    private String roomId;
    private String hostId;
    private String roomName;
    private List<String> userIds;
}
