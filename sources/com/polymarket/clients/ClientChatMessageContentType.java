package com.polymarket.clients;

import com.polymarket.data.EGameTimeline;
import com.polymarket.data.ELatestHighlight;
import com.polymarket.data.ESquadStatusUpdate;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import skip.lib.Hasher;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000  2\u00020\u0001:\u0007\u001a\u001b\u001c\u001d\u001e\u001f B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0011\u0010\u000b\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0011\u0010\r\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0011\u0010\u000f\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0011\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\tH\u0082 J\u0016\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\u0006\u0010\u0017\u001a\u00020\u0018H\u0082 R\u0011\u0010\u0004\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0006R\u0011\u0010\n\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\n\u0010\u0006R\u0011\u0010\f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\f\u0010\u0006R\u0011\u0010\u000e\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u0006R\u0011\u0010\u0010\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012\u0082\u0001\u0006!\"#$%&¨\u0006'"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "isPlayByPlay", "", "()Z", "Swift_isPlayByPlay", "className", "", "isGameTimeline", "Swift_isGameTimeline", "isSquadStatus", "Swift_isSquadStatus", "isSquadPosition", "Swift_isSquadPosition", "textualRepresentation", "getTextualRepresentation", "()Ljava/lang/String;", "Swift_textualRepresentation", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "TextCase", "PlayByPlayCase", "GameTimelineCase", "SquadStatusCase", "SquadPositionCase", "UnsupportedCase", "Companion", "Lcom/polymarket/clients/ClientChatMessageContentType$GameTimelineCase;", "Lcom/polymarket/clients/ClientChatMessageContentType$PlayByPlayCase;", "Lcom/polymarket/clients/ClientChatMessageContentType$SquadPositionCase;", "Lcom/polymarket/clients/ClientChatMessageContentType$SquadStatusCase;", "Lcom/polymarket/clients/ClientChatMessageContentType$TextCase;", "Lcom/polymarket/clients/ClientChatMessageContentType$UnsupportedCase;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ClientChatMessageContentType implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ClientChatMessageContentType unsupported = new UnsupportedCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$GameTimelineCase;", "Lcom/polymarket/clients/ClientChatMessageContentType;", "associated0", "Lcom/polymarket/data/EGameTimeline;", "<init>", "(Lcom/polymarket/data/EGameTimeline;)V", "getAssociated0", "()Lcom/polymarket/data/EGameTimeline;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class GameTimelineCase extends ClientChatMessageContentType {
        private final EGameTimeline associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public GameTimelineCase(EGameTimeline eGameTimeline) {
            super(null);
            eGameTimeline.getClass();
            this.associated0 = eGameTimeline;
        }

        public boolean equals(Object other) {
            if (!(other instanceof GameTimelineCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((GameTimelineCase) other).associated0);
        }

        public final EGameTimeline getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$PlayByPlayCase;", "Lcom/polymarket/clients/ClientChatMessageContentType;", "associated0", "Lcom/polymarket/data/ELatestHighlight;", "<init>", "(Lcom/polymarket/data/ELatestHighlight;)V", "getAssociated0", "()Lcom/polymarket/data/ELatestHighlight;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class PlayByPlayCase extends ClientChatMessageContentType {
        private final ELatestHighlight associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PlayByPlayCase(ELatestHighlight eLatestHighlight) {
            super(null);
            eLatestHighlight.getClass();
            this.associated0 = eLatestHighlight;
        }

        public boolean equals(Object other) {
            if (!(other instanceof PlayByPlayCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((PlayByPlayCase) other).associated0);
        }

        public final ELatestHighlight getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$SquadPositionCase;", "Lcom/polymarket/clients/ClientChatMessageContentType;", "associated0", "Lcom/polymarket/clients/ClientChatSquadPositionCard;", "<init>", "(Lcom/polymarket/clients/ClientChatSquadPositionCard;)V", "getAssociated0", "()Lcom/polymarket/clients/ClientChatSquadPositionCard;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadPositionCase extends ClientChatMessageContentType {
        private final ClientChatSquadPositionCard associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadPositionCase(ClientChatSquadPositionCard clientChatSquadPositionCard) {
            super(null);
            clientChatSquadPositionCard.getClass();
            this.associated0 = clientChatSquadPositionCard;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SquadPositionCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SquadPositionCase) other).associated0);
        }

        public final ClientChatSquadPositionCard getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$SquadStatusCase;", "Lcom/polymarket/clients/ClientChatMessageContentType;", "associated0", "Lcom/polymarket/data/ESquadStatusUpdate;", "<init>", "(Lcom/polymarket/data/ESquadStatusUpdate;)V", "getAssociated0", "()Lcom/polymarket/data/ESquadStatusUpdate;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class SquadStatusCase extends ClientChatMessageContentType {
        private final ESquadStatusUpdate associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SquadStatusCase(ESquadStatusUpdate eSquadStatusUpdate) {
            super(null);
            eSquadStatusUpdate.getClass();
            this.associated0 = eSquadStatusUpdate;
        }

        public boolean equals(Object other) {
            if (!(other instanceof SquadStatusCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((SquadStatusCase) other).associated0);
        }

        public final ESquadStatusUpdate getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0013\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096\u0002J\b\u0010\f\u001a\u00020\rH\u0016R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000e"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$TextCase;", "Lcom/polymarket/clients/ClientChatMessageContentType;", "associated0", "", "<init>", "(Ljava/lang/String;)V", "getAssociated0", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class TextCase extends ClientChatMessageContentType {
        private final String associated0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextCase(String str) {
            super(null);
            str.getClass();
            this.associated0 = str;
        }

        public boolean equals(Object other) {
            if (!(other instanceof TextCase)) {
                return false;
            }
            return Intrinsics.areEqual(this.associated0, ((TextCase) other).associated0);
        }

        public final String getAssociated0() {
            return this.associated0;
        }

        public int hashCode() {
            return Hasher.INSTANCE.combine(1, this.associated0);
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$UnsupportedCase;", "Lcom/polymarket/clients/ClientChatMessageContentType;", "<init>", "()V", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnsupportedCase extends ClientChatMessageContentType {
        public UnsupportedCase() {
            super(null);
        }
    }

    public /* synthetic */ ClientChatMessageContentType(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native boolean Swift_isGameTimeline(String className);

    private final native boolean Swift_isPlayByPlay(String className);

    private final native boolean Swift_isSquadPosition(String className);

    private final native boolean Swift_isSquadStatus(String className);

    private final native Function0<Object> Swift_projectionImpl(int options);

    private final native String Swift_textualRepresentation(String className);

    public static final /* synthetic */ ClientChatMessageContentType access$getUnsupported$cp() {
        return unsupported;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    public final String getTextualRepresentation() {
        return Swift_textualRepresentation(getClass().getName());
    }

    public final boolean isGameTimeline() {
        return Swift_isGameTimeline(getClass().getName());
    }

    public final boolean isPlayByPlay() {
        return Swift_isPlayByPlay(getClass().getName());
    }

    public final boolean isSquadPosition() {
        return Swift_isSquadPosition(getClass().getName());
    }

    public final boolean isSquadStatus() {
        return Swift_isSquadStatus(getClass().getName());
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\tJ\u000e\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000bJ\u000e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\rJ\u000e\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u000fR\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/polymarket/clients/ClientChatMessageContentType$Companion;", "", "<init>", "()V", "text", "Lcom/polymarket/clients/ClientChatMessageContentType;", "associated0", "", "playByPlay", "Lcom/polymarket/data/ELatestHighlight;", "gameTimeline", "Lcom/polymarket/data/EGameTimeline;", "squadStatus", "Lcom/polymarket/data/ESquadStatusUpdate;", "squadPosition", "Lcom/polymarket/clients/ClientChatSquadPositionCard;", "unsupported", "getUnsupported", "()Lcom/polymarket/clients/ClientChatMessageContentType;", "AppClients"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ClientChatMessageContentType gameTimeline(EGameTimeline associated0) {
            associated0.getClass();
            return new GameTimelineCase(associated0);
        }

        public final ClientChatMessageContentType getUnsupported() {
            return ClientChatMessageContentType.access$getUnsupported$cp();
        }

        public final ClientChatMessageContentType playByPlay(ELatestHighlight associated0) {
            associated0.getClass();
            return new PlayByPlayCase(associated0);
        }

        public final ClientChatMessageContentType squadPosition(ClientChatSquadPositionCard associated0) {
            associated0.getClass();
            return new SquadPositionCase(associated0);
        }

        public final ClientChatMessageContentType squadStatus(ESquadStatusUpdate associated0) {
            associated0.getClass();
            return new SquadStatusCase(associated0);
        }

        public final ClientChatMessageContentType text(String associated0) {
            associated0.getClass();
            return new TextCase(associated0);
        }

        private Companion() {
        }
    }

    private ClientChatMessageContentType() {
    }
}
