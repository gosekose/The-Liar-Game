package liar.waitservice.wait.controller.dto.message;

import liar.waitservice.wait.controller.dto.message.code.SuccessCode;
import liar.waitservice.wait.controller.dto.message.message.SuccessMessage;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class SendSuccessBody<T> extends SendSuccess {

    public T body;

    public SendSuccessBody(String code, String message, T body) {
        super(code, message);
        this.body = body;
    }

    public static <T> SendSuccessBody of(String code, String message, T body) {
        return new SendSuccessBody(code, message, body);
    }

    public static <T> SendSuccessBody of(T body) {
        return new SendSuccessBody(SuccessCode.OK, SuccessMessage.OK, body);
    }

}
