package com.polymarket.data;

import io.getstream.chat.android.models.CommandDefaults;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import skip.lib.SwiftProjecting;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000 \f2\u00020\u0001:\u0003\n\u000b\fB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0007\u001a\u00020\bH\u0082 \u0082\u0001\u0002\r\u000e¨\u0006\u000f"}, d2 = {"Lcom/polymarket/data/ESquadMuteMode;", "Lskip/lib/SwiftProjecting;", "<init>", "()V", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "UnmuteCase", "MuteCase", "Companion", "Lcom/polymarket/data/ESquadMuteMode$MuteCase;", "Lcom/polymarket/data/ESquadMuteMode$UnmuteCase;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ESquadMuteMode implements SwiftProjecting {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final ESquadMuteMode unmute = new UnmuteCase();

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u0015\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\n\u0010\u0007¨\u0006\u000b"}, d2 = {"Lcom/polymarket/data/ESquadMuteMode$MuteCase;", "Lcom/polymarket/data/ESquadMuteMode;", "associated0", "", "<init>", "(Ljava/lang/Double;)V", "getAssociated0", "()Ljava/lang/Double;", "Ljava/lang/Double;", "duration", "getDuration", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class MuteCase extends ESquadMuteMode {
        private final Double associated0;
        private final Double duration;

        public MuteCase(Double d) {
            super(null);
            this.associated0 = d;
            this.duration = d;
        }

        public final Double getAssociated0() {
            return this.associated0;
        }

        public final Double getDuration() {
            return this.duration;
        }
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/polymarket/data/ESquadMuteMode$UnmuteCase;", "Lcom/polymarket/data/ESquadMuteMode;", "<init>", "()V", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnmuteCase extends ESquadMuteMode {
        public UnmuteCase() {
            super(null);
        }
    }

    public /* synthetic */ ESquadMuteMode(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private final native Function0<Object> Swift_projectionImpl(int options);

    public static final /* synthetic */ ESquadMuteMode access$getUnmute$cp() {
        return unmute;
    }

    @Override // skip.lib.SwiftProjecting
    public Function0<Object> Swift_projection(int options) {
        return Swift_projectionImpl(options);
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\b\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\f"}, d2 = {"Lcom/polymarket/data/ESquadMuteMode$Companion;", "", "<init>", "()V", CommandDefaults.UNMUTE, "Lcom/polymarket/data/ESquadMuteMode;", "getUnmute", "()Lcom/polymarket/data/ESquadMuteMode;", CommandDefaults.MUTE, "duration", "", "(Ljava/lang/Double;)Lcom/polymarket/data/ESquadMuteMode;", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ ESquadMuteMode mute$default(Companion companion, Double d, int i, Object obj) {
            if ((i & 1) != 0) {
                d = null;
            }
            return companion.mute(d);
        }

        public final ESquadMuteMode getUnmute() {
            return ESquadMuteMode.access$getUnmute$cp();
        }

        public final ESquadMuteMode mute(Double duration) {
            return new MuteCase(duration);
        }

        private Companion() {
        }
    }

    private ESquadMuteMode() {
    }
}
