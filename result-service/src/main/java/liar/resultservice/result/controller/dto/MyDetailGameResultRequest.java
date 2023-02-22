package liar.resultservice.result.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
public class MyDetailGameResultRequest {
    private String userId;
    private Boolean viewLatest;
    private Boolean viewOnlyWin;
    private Boolean viewOnlyLose;
    private String searchGameName;
}
