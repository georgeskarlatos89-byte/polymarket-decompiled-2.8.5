package com.polymarket.data;

import com.socure.docv.capturesdk.api.Keys;
import defpackage.ug7;
import defpackage.ww4;
import io.intercom.android.sdk.metrics.MetricTracker;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import skip.lib.SwiftProjecting;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u0000 \u00052\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0002\u0004\u0005B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/polymarket/data/RouterTransition;", "", "<init>", "(Ljava/lang/String;I)V", "Forward", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class RouterTransition {
    private static final /* synthetic */ ug7 $ENTRIES;
    private static final /* synthetic */ RouterTransition[] $VALUES;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\u0081\u0002\u0018\u0000 \u00172\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0017B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0011\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0011\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000eH\u0082 J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0016J\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0014\u001a\u00020\u0015H\u0082 R\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u000f\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u000bj\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\u0018"}, d2 = {"Lcom/polymarket/data/RouterTransition$Forward;", "Lskip/lib/SwiftProjecting;", "", "<init>", "(Ljava/lang/String;I)V", MetricTracker.Place.PUSH, "pushFullScreen", "modal", "modalFullScreen", "isPush", "", "()Z", "Swift_isPush", Keys.KEY_NAME, "", "isModal", "Swift_isModal", "Swift_projection", "Lkotlin/Function0;", "", "options", "", "Swift_projectionImpl", "Companion", "AppData"}, k = 1, mv = {2, 2, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class Forward implements SwiftProjecting {
        private static final /* synthetic */ ug7 $ENTRIES;
        private static final /* synthetic */ Forward[] $VALUES;
        public static final Forward push = new Forward(MetricTracker.Place.PUSH, 0);
        public static final Forward pushFullScreen = new Forward("pushFullScreen", 1);
        public static final Forward modal = new Forward("modal", 2);
        public static final Forward modalFullScreen = new Forward("modalFullScreen", 3);

        private static final /* synthetic */ Forward[] $values() {
            return new Forward[]{push, pushFullScreen, modal, modalFullScreen};
        }

        static {
            Forward[] $values = $values();
            $VALUES = $values;
            $ENTRIES = ww4.b($values);
            INSTANCE = new Companion(null);
        }

        private Forward(String str, int i) {
        }

        private final native boolean Swift_isModal(String name);

        private final native boolean Swift_isPush(String name);

        private final native Function0<Object> Swift_projectionImpl(int options);

        public static ug7 getEntries() {
            return $ENTRIES;
        }

        public static Forward valueOf(String str) {
            return (Forward) Enum.valueOf(Forward.class, str);
        }

        public static Forward[] values() {
            return (Forward[]) $VALUES.clone();
        }

        @Override // skip.lib.SwiftProjecting
        public Function0<Object> Swift_projection(int options) {
            return Swift_projectionImpl(options);
        }

        public final boolean isModal() {
            return Swift_isModal(name());
        }

        public final boolean isPush() {
            return Swift_isPush(name());
        }
    }

    private static final /* synthetic */ RouterTransition[] $values() {
        return new RouterTransition[0];
    }

    static {
        RouterTransition[] $values = $values();
        $VALUES = $values;
        $ENTRIES = ww4.b($values);
        INSTANCE = new Companion(null);
    }

    private RouterTransition(String str, int i) {
    }

    public static ug7 getEntries() {
        return $ENTRIES;
    }

    public static RouterTransition valueOf(String str) {
        return (RouterTransition) Enum.valueOf(RouterTransition.class, str);
    }

    public static RouterTransition[] values() {
        return (RouterTransition[]) $VALUES.clone();
    }
}
