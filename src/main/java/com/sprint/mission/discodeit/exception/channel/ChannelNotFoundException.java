package com.sprint.mission.discodeit.exception.channel;

import com.sprint.mission.discodeit.exception.ErrorCode;
import java.util.UUID;

public class ChannelNotFoundException extends ChannelException {

  public ChannelNotFoundException() {
    super(ErrorCode.CHANNEL_NOT_FOUND);
  }

  public static ChannelNotFoundException byId(UUID channelId) {
    ChannelNotFoundException exception = new ChannelNotFoundException();
    exception.addDetail("channelId", channelId);
    return exception;
  }

}
