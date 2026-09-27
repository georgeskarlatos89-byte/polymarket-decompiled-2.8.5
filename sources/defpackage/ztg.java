package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class ztg extends Lambda implements Function0 {
    public static final ztg i = new ztg(0, 0);
    public static final ztg j = new ztg(0, 1);
    public static final ztg k = new ztg(0, 2);
    public static final ztg l = new ztg(0, 3);
    public static final ztg m = new ztg(0, 4);
    public static final ztg n = new ztg(0, 5);
    public static final ztg o = new ztg(0, 6);
    public static final ztg p = new ztg(0, 7);
    public static final ztg q = new ztg(0, 8);
    public static final ztg r = new ztg(0, 9);
    public static final ztg s = new ztg(0, 10);
    public static final ztg t = new ztg(0, 11);
    public static final ztg u = new ztg(0, 12);
    public static final ztg v = new ztg(0, 13);
    public static final ztg w = new ztg(0, 14);
    public static final ztg x = new ztg(0, 15);
    public final /* synthetic */ int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ztg(int i2, int i3) {
        super(i2);
        this.h = i3;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Try blocks wrapping queue limit reached! Please report as an issue!
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:95)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:325)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:51)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // kotlin.jvm.functions.Function0
    public final java.lang.Object invoke() {
        /*
            r3 = this;
            int r3 = r3.h
            r0 = 0
            r1 = 1
            r2 = 0
            switch(r3) {
                case 0: goto Lb3;
                case 1: goto Lae;
                case 2: goto La9;
                case 3: goto La6;
                case 4: goto La5;
                case 5: goto La2;
                case 6: goto L9c;
                case 7: goto L99;
                case 8: goto L84;
                case 9: goto L79;
                case 10: goto L65;
                case 11: goto L57;
                case 12: goto L42;
                case 13: goto L3b;
                case 14: goto L22;
                default: goto L8;
            }
        L8:
            android.content.res.Resources r3 = android.content.res.Resources.getSystem()
            java.lang.String r0 = "string"
            java.lang.String r1 = "android"
            java.lang.String r2 = "tooltip_popup_title"
            int r3 = r3.getIdentifier(r2, r0, r1)
            android.content.res.Resources r0 = android.content.res.Resources.getSystem()     // Catch: android.content.res.Resources.NotFoundException -> L1f
            java.lang.String r3 = r0.getString(r3)     // Catch: android.content.res.Resources.NotFoundException -> L1f
            goto L21
        L1f:
            java.lang.String r3 = "Tooltip"
        L21:
            return r3
        L22:
            kotlin.Lazy r3 = defpackage.rmk.a
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L3a
            java.lang.String r0 = "mWindow"
            java.lang.reflect.Field r0 = r3.getDeclaredField(r0)     // Catch: java.lang.NoSuchFieldException -> L37
            r0.setAccessible(r1)     // Catch: java.lang.NoSuchFieldException -> L37
            r2 = r0
            goto L3a
        L37:
            r3.toString()
        L3a:
            return r2
        L3b:
            java.lang.String r3 = "com.android.internal.policy.DecorView"
            java.lang.Class r2 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L41
        L41:
            return r2
        L42:
            kotlin.Lazy r3 = defpackage.emk.a
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L56
            java.lang.String r0 = "getInstance"
            java.lang.reflect.Method r3 = r3.getMethod(r0, r2)
            java.lang.Object r2 = r3.invoke(r2, r2)
        L56:
            return r2
        L57:
            java.lang.String r3 = "android.view.WindowManagerGlobal"
            java.lang.Class r2 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L5e
            goto L64
        L5e:
            r3 = move-exception
            java.lang.String r0 = "WindowManagerSpy"
            io.sentry.android.core.m0.r(r0, r3)
        L64:
            return r2
        L65:
            kotlin.Lazy r3 = defpackage.emk.a
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L78
            java.lang.String r0 = "mViews"
            java.lang.reflect.Field r2 = r3.getDeclaredField(r0)
            r2.setAccessible(r1)
        L78:
            return r2
        L79:
            java.lang.Class<androidx.appcompat.view.WindowCallbackWrapper> r3 = androidx.appcompat.view.WindowCallbackWrapper.class
            goto L83
        L7c:
            java.lang.String r3 = "android.support.v7.view.WindowCallbackWrapper"
            java.lang.Class r2 = java.lang.Class.forName(r3)     // Catch: java.lang.Throwable -> L82
        L82:
            r3 = r2
        L83:
            return r3
        L84:
            kotlin.Lazy r3 = defpackage.ukk.d
            java.lang.Object r3 = r3.getValue()
            java.lang.Class r3 = (java.lang.Class) r3
            if (r3 == 0) goto L98
            java.lang.String r0 = "mWrapped"
            java.lang.reflect.Field r3 = r3.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L98
            r3.setAccessible(r1)     // Catch: java.lang.Throwable -> L98
            r2 = r3
        L98:
            return r2
        L99:
            awi r3 = defpackage.awi.l
            return r3
        L9c:
            i6k r3 = new i6k
            r3.<init>()
            return r3
        La2:
            kotlin.Unit r3 = kotlin.Unit.INSTANCE
            return r3
        La5:
            return r2
        La6:
            java.lang.Boolean r3 = java.lang.Boolean.FALSE
            return r3
        La9:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        Lae:
            java.lang.Float r3 = java.lang.Float.valueOf(r0)
            return r3
        Lb3:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ztg.invoke():java.lang.Object");
    }
}
