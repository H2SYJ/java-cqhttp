package com.zhuangxv.bot.message.support;

import com.alibaba.fastjson.JSON;
import com.zhuangxv.bot.message.Message;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
public class ReplyMessage implements Message {

    private int id;

    private String text;

    private long qq;

    private long seq;

    public ReplyMessage(int messageId) {
        this.id = messageId;
    }

    @Override
    public String toString() {
        return "reply[" + id + "]";
    }

    @Override
    public String toMessageString() {
        return String.format("{\"type\":\"%s\",\"data\":%s}", "reply", JSON.toJSONString(this));
    }

}
