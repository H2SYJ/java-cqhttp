package com.zhuangxv.bot.injector.support;

import com.zhuangxv.bot.core.Bot;
import com.zhuangxv.bot.event.BaseEvent;
import com.zhuangxv.bot.event.message.GroupRecallEvent;
import com.zhuangxv.bot.injector.ObjectInjector;
import com.zhuangxv.bot.message.RecallMessage;

public class RecallMessageInjector implements ObjectInjector<RecallMessage> {
    @Override
    public Class<RecallMessage> getClassType() {
        return RecallMessage.class;
    }

    @Override
    public String[] getType() {
        return new String[]{"recallMessage"};
    }

    @Override
    public RecallMessage getObject(BaseEvent event, Bot bot) {
        if (event instanceof GroupRecallEvent) {
            GroupRecallEvent groupRecallEvent = (GroupRecallEvent) event;
            RecallMessage recallMessage = new RecallMessage();
            recallMessage.setSenderId(groupRecallEvent.getUserId());
            recallMessage.setOperatorId(groupRecallEvent.getOperatorId());
            return recallMessage;
        }
        return null;
    }
}
