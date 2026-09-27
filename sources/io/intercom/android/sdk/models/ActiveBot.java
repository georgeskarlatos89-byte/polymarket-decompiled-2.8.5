package io.intercom.android.sdk.models;

import com.google.gson.annotations.SerializedName;
import defpackage.hdi;
import io.intercom.android.sdk.models.Participant;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÇ\u0001J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H×\u0003J\t\u0010\u0017\u001a\u00020\u0018H×\u0001J\t\u0010\u0019\u001a\u00020\u001aH×\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lio/intercom/android/sdk/models/ActiveBot;", "", "participant", "Lio/intercom/android/sdk/models/Participant$Builder;", "isAi", "", "isIdentityCustomized", "streamingPart", "Lio/intercom/android/sdk/models/StreamingPart;", "<init>", "(Lio/intercom/android/sdk/models/Participant$Builder;ZZLio/intercom/android/sdk/models/StreamingPart;)V", "getParticipant", "()Lio/intercom/android/sdk/models/Participant$Builder;", "()Z", "getStreamingPart", "()Lio/intercom/android/sdk/models/StreamingPart;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "intercom-sdk-base_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class ActiveBot {
    public static final int $stable = 8;

    @SerializedName("has_ai")
    private final boolean isAi;

    @SerializedName("has_customized_identity")
    private final boolean isIdentityCustomized;

    @SerializedName("participant")
    private final Participant.Builder participant;

    @SerializedName("streaming_part")
    private final StreamingPart streamingPart;

    public /* synthetic */ ActiveBot(Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? new Participant.Builder() : builder, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : streamingPart);
    }

    public static /* synthetic */ ActiveBot copy$default(ActiveBot activeBot, Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart, int i, Object obj) {
        if ((i & 1) != 0) {
            builder = activeBot.participant;
        }
        if ((i & 2) != 0) {
            z = activeBot.isAi;
        }
        if ((i & 4) != 0) {
            z2 = activeBot.isIdentityCustomized;
        }
        if ((i & 8) != 0) {
            streamingPart = activeBot.streamingPart;
        }
        return activeBot.copy(builder, z, z2, streamingPart);
    }

    /* renamed from: component1, reason: from getter */
    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsAi() {
        return this.isAi;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    /* renamed from: component4, reason: from getter */
    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public final ActiveBot copy(Participant.Builder participant, boolean isAi, boolean isIdentityCustomized, StreamingPart streamingPart) {
        participant.getClass();
        return new ActiveBot(participant, isAi, isIdentityCustomized, streamingPart);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActiveBot)) {
            return false;
        }
        ActiveBot activeBot = (ActiveBot) other;
        if (Intrinsics.areEqual(this.participant, activeBot.participant) && this.isAi == activeBot.isAi && this.isIdentityCustomized == activeBot.isIdentityCustomized && Intrinsics.areEqual(this.streamingPart, activeBot.streamingPart)) {
            return true;
        }
        return false;
    }

    public final Participant.Builder getParticipant() {
        return this.participant;
    }

    public final StreamingPart getStreamingPart() {
        return this.streamingPart;
    }

    public int hashCode() {
        int hashCode;
        int g = hdi.g(hdi.g(this.participant.hashCode() * 31, 31, this.isAi), 31, this.isIdentityCustomized);
        StreamingPart streamingPart = this.streamingPart;
        if (streamingPart == null) {
            hashCode = 0;
        } else {
            hashCode = streamingPart.hashCode();
        }
        return g + hashCode;
    }

    public final boolean isAi() {
        return this.isAi;
    }

    public final boolean isIdentityCustomized() {
        return this.isIdentityCustomized;
    }

    public String toString() {
        return "ActiveBot(participant=" + this.participant + ", isAi=" + this.isAi + ", isIdentityCustomized=" + this.isIdentityCustomized + ", streamingPart=" + this.streamingPart + ')';
    }

    public ActiveBot(Participant.Builder builder, boolean z, boolean z2, StreamingPart streamingPart) {
        builder.getClass();
        this.participant = builder;
        this.isAi = z;
        this.isIdentityCustomized = z2;
        this.streamingPart = streamingPart;
    }

    public ActiveBot() {
        this(null, false, false, null, 15, null);
    }
}
