package io.getstream.chat.android.client.api2.model.response;

import com.socure.docv.capturesdk.common.utils.ConstantsKt;
import defpackage.mda;
import io.getstream.chat.android.client.api2.model.dto.ChatEventDto;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lio/getstream/chat/android/client/api2/model/response/EventResponse;", "", "event", "Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "duration", "", "<init>", "(Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;Ljava/lang/String;)V", "getEvent", "()Lio/getstream/chat/android/client/api2/model/dto/ChatEventDto;", "getDuration", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "stream-chat-android-client_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
@mda(generateAdapter = ConstantsKt.HELP_ALREADY_INITIATED)
/* loaded from: classes4.dex */
public final /* data */ class EventResponse {
    private final String duration;
    private final ChatEventDto event;

    public EventResponse(ChatEventDto chatEventDto, String str) {
        chatEventDto.getClass();
        str.getClass();
        this.event = chatEventDto;
        this.duration = str;
    }

    public static /* synthetic */ EventResponse copy$default(EventResponse eventResponse, ChatEventDto chatEventDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            chatEventDto = eventResponse.event;
        }
        if ((i & 2) != 0) {
            str = eventResponse.duration;
        }
        return eventResponse.copy(chatEventDto, str);
    }

    /* renamed from: component1, reason: from getter */
    public final ChatEventDto getEvent() {
        return this.event;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDuration() {
        return this.duration;
    }

    public final EventResponse copy(ChatEventDto event, String duration) {
        event.getClass();
        duration.getClass();
        return new EventResponse(event, duration);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EventResponse)) {
            return false;
        }
        EventResponse eventResponse = (EventResponse) other;
        if (Intrinsics.areEqual(this.event, eventResponse.event) && Intrinsics.areEqual(this.duration, eventResponse.duration)) {
            return true;
        }
        return false;
    }

    public final String getDuration() {
        return this.duration;
    }

    public final ChatEventDto getEvent() {
        return this.event;
    }

    public int hashCode() {
        return this.duration.hashCode() + (this.event.hashCode() * 31);
    }

    public String toString() {
        return "EventResponse(event=" + this.event + ", duration=" + this.duration + ")";
    }
}
