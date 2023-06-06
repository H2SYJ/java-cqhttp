package com.zhuangxv.bot.message.support;

import com.zhuangxv.bot.message.Message;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author xiaoxu
 * @since 2022-05-24 10:19
 */
@Data
@Accessors(chain = true)
public class UnknownMessage implements Message {

    private String json;

    @Override
    public String toString() {
        return "json[" + json + "]";
    }

    @Override
    public String toMessageString() {
        return this.json;
    }
}
