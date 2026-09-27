package io.sentry.android.fragment;

import io.intercom.android.sdk.metrics.MetricTracker;
import java.util.HashSet;
import java.util.Set;

/* JADX WARN: Enum visitor error
jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 io.sentry.android.fragment.b, still in use, count: 1, list:
  (r0v0 io.sentry.android.fragment.b) from 0x0099: INVOKE (r11v5 java.util.HashSet), (r0v0 io.sentry.android.fragment.b) VIRTUAL call: java.util.HashSet.add(java.lang.Object):boolean A[MD:(E):boolean (c)] (LINE:154)
	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:151)
	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:116)
	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:88)
	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:87)
	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:238)
	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:180)
	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:100)
 */
/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class b {
    ATTACHED("attached"),
    SAVE_INSTANCE_STATE("save instance state"),
    CREATED("created"),
    VIEW_CREATED("view created"),
    STARTED(MetricTracker.Action.STARTED),
    RESUMED("resumed"),
    PAUSED("paused"),
    STOPPED("stopped"),
    VIEW_DESTROYED("view destroyed"),
    DESTROYED("destroyed"),
    DETACHED("detached");

    private static final Set<b> states;
    private final String breadcrumbName;
    public static final a Companion = new Object();

    /* JADX WARN: Type inference failed for: r11v4, types: [io.sentry.android.fragment.a, java.lang.Object] */
    static {
        HashSet hashSet = new HashSet();
        hashSet.add(new b("attached"));
        hashSet.add(new b("save instance state"));
        hashSet.add(new b("created"));
        hashSet.add(new b("view created"));
        hashSet.add(new b(MetricTracker.Action.STARTED));
        hashSet.add(new b("resumed"));
        hashSet.add(new b("paused"));
        hashSet.add(new b("stopped"));
        hashSet.add(new b("view destroyed"));
        hashSet.add(new b("destroyed"));
        hashSet.add(new b("detached"));
        states = hashSet;
    }

    private b(String str) {
        this.breadcrumbName = str;
    }

    public static final /* synthetic */ Set access$getStates$cp() {
        return states;
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) $VALUES.clone();
    }

    public final String getBreadcrumbName$sentry_android_fragment_release() {
        return this.breadcrumbName;
    }
}
