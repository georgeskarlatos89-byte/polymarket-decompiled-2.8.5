package io.intercom.android.sdk.ui.theme;

import defpackage.b57;
import defpackage.ggf;
import defpackage.hpn;
import defpackage.hv9;
import defpackage.ib4;
import defpackage.ikl;
import defpackage.jb4;
import defpackage.qqc;
import defpackage.vb4;
import defpackage.yb4;
import io.intercom.android.sdk.ui.theme.BaseColors;
import kotlin.Metadata;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\u001aE\u0010\f\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u000f\u0010\r\u001a\u00020\tH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u000f\u0010\u000f\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000f\u0010\u000e\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\tH\u0000¢\u0006\u0004\b\u0011\u0010\u0012\"\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"(\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lib4;", "action", "onAction", "actionContrastWhite", "onActionContrastWhite", "header", "onHeader", "", "isLight", "Lio/intercom/android/sdk/ui/theme/IntercomColors;", "getIntercomColors-nl4AeYM", "(JJJJJJZ)Lio/intercom/android/sdk/ui/theme/IntercomColors;", "getIntercomColors", "intercomLightColors", "()Lio/intercom/android/sdk/ui/theme/IntercomColors;", "intercomDarkColors", "Lvb4;", "toMaterialColors", "(Lio/intercom/android/sdk/ui/theme/IntercomColors;)Lvb4;", "Lggf;", "LocalIntercomColors", "Lggf;", "getLocalIntercomColors", "()Lggf;", "Lqqc;", "Lio/intercom/android/sdk/ui/theme/ThemeMode;", "currentThemeMode", "Lqqc;", "getCurrentThemeMode", "()Lqqc;", "setCurrentThemeMode", "(Lqqc;)V", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class IntercomColorsKt {
    private static final ggf LocalIntercomColors = new b57(new hv9(5), 1);
    private static qqc currentThemeMode = ikl.c(ThemeMode.LIGHT);

    private static final IntercomColors LocalIntercomColors$lambda$0() {
        return intercomLightColors();
    }

    public static /* synthetic */ IntercomColors a() {
        return LocalIntercomColors$lambda$0();
    }

    public static final qqc getCurrentThemeMode() {
        return currentThemeMode;
    }

    /* renamed from: getIntercomColors-nl4AeYM, reason: not valid java name */
    public static final IntercomColors m762getIntercomColorsnl4AeYM(long j, long j2, long j3, long j4, long j5, long j6, boolean z) {
        if (z) {
            return IntercomColors.m710copyPUsAYug$default(intercomLightColors(), j, j2, j3, j4, j5, j6, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, -64, null);
        }
        return IntercomColors.m710copyPUsAYug$default(intercomDarkColors(), j, j2, j3, j4, j5, j6, null, null, null, null, null, null, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, false, -64, null);
    }

    public static final ggf getLocalIntercomColors() {
        return LocalIntercomColors;
    }

    public static final IntercomColors intercomDarkColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long m597getFallback0d7_KjU = baseColors.m597getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(m597getFallback0d7_KjU, newColorScheme.m612getGray250d7_KjU(), newColorScheme.m612getGray250d7_KjU(), newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m612getGray250d7_KjU(), new IntercomBaseColors(newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m620getGray8500d7_KjU(), newColorScheme.m621getGray9000d7_KjU(), null), new IntercomTextColors(newColorScheme.m615getGray500d7_KjU(), newColorScheme.m614getGray4000d7_KjU(), newColorScheme.m616getGray5000d7_KjU(), newColorScheme.m616getGray5000d7_KjU(), newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m635getRed1000d7_KjU(), newColorScheme.m625getGreen500d7_KjU(), newColorScheme.m647getYellow500d7_KjU(), null), new IntercomIconColors(newColorScheme.m612getGray250d7_KjU(), newColorScheme.m614getGray4000d7_KjU(), newColorScheme.m616getGray5000d7_KjU(), newColorScheme.m616getGray5000d7_KjU(), newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m635getRed1000d7_KjU(), newColorScheme.m623getGreen1000d7_KjU(), newColorScheme.m647getYellow500d7_KjU(), null), new IntercomContainerColors(newColorScheme.m620getGray8500d7_KjU(), newColorScheme.m618getGray7000d7_KjU(), newColorScheme.m620getGray8500d7_KjU(), newColorScheme.m635getRed1000d7_KjU(), newColorScheme.m604getBlue5000d7_KjU(), newColorScheme.m627getGreen6000d7_KjU(), newColorScheme.m612getGray250d7_KjU(), null), new IntercomBorderColors(newColorScheme.m620getGray8500d7_KjU(), newColorScheme.m618getGray7000d7_KjU(), null), new IntercomAlphaColors(ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14), null), baseColors.m591getBlack100d7_KjU(), newColorScheme.m620getGray8500d7_KjU(), baseColors.m591getBlack100d7_KjU(), hpn.c(4293256677L), hpn.c(4281216558L), baseColors.m591getBlack100d7_KjU(), baseColors.m594getBlack900d7_KjU(), baseColors.m593getBlack700d7_KjU(), ib4.b(newColorScheme.m620getGray8500d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14), baseColors.m592getBlack200d7_KjU(), newColorScheme.m620getGray8500d7_KjU(), baseColors.m591getBlack100d7_KjU(), ib4.b(newColorScheme.m620getGray8500d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m620getGray8500d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14), baseColors.m599getRed0d7_KjU(), baseColors.m596getBlue0d7_KjU(), baseColors.m598getGreenLighter200d7_KjU(), baseColors.m599getRed0d7_KjU(), hpn.c(4279176975L), false, null);
    }

    public static final IntercomColors intercomLightColors() {
        BaseColors baseColors = BaseColors.INSTANCE;
        long m597getFallback0d7_KjU = baseColors.m597getFallback0d7_KjU();
        BaseColors.NewColorScheme newColorScheme = BaseColors.NewColorScheme.INSTANCE;
        return new IntercomColors(m597getFallback0d7_KjU, newColorScheme.m644getWhite0d7_KjU(), baseColors.m590getBlack0d7_KjU(), newColorScheme.m644getWhite0d7_KjU(), newColorScheme.m644getWhite0d7_KjU(), baseColors.m590getBlack0d7_KjU(), new IntercomBaseColors(newColorScheme.m644getWhite0d7_KjU(), newColorScheme.m610getGray1000d7_KjU(), newColorScheme.m644getWhite0d7_KjU(), null), new IntercomTextColors(newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m616getGray5000d7_KjU(), newColorScheme.m614getGray4000d7_KjU(), newColorScheme.m614getGray4000d7_KjU(), newColorScheme.m612getGray250d7_KjU(), newColorScheme.m640getRed6000d7_KjU(), newColorScheme.m628getGreen7000d7_KjU(), newColorScheme.m651getYellow8000d7_KjU(), null), new IntercomIconColors(newColorScheme.m621getGray9000d7_KjU(), newColorScheme.m616getGray5000d7_KjU(), newColorScheme.m614getGray4000d7_KjU(), newColorScheme.m614getGray4000d7_KjU(), newColorScheme.m612getGray250d7_KjU(), newColorScheme.m640getRed6000d7_KjU(), newColorScheme.m626getGreen5000d7_KjU(), newColorScheme.m651getYellow8000d7_KjU(), null), new IntercomContainerColors(newColorScheme.m610getGray1000d7_KjU(), newColorScheme.m611getGray2000d7_KjU(), newColorScheme.m644getWhite0d7_KjU(), newColorScheme.m639getRed5000d7_KjU(), newColorScheme.m604getBlue5000d7_KjU(), newColorScheme.m627getGreen6000d7_KjU(), newColorScheme.m621getGray9000d7_KjU(), null), new IntercomBorderColors(newColorScheme.m610getGray1000d7_KjU(), newColorScheme.m611getGray2000d7_KjU(), null), new IntercomAlphaColors(ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m622getGray9500d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.2f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.3f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.5f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.6f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.7f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.8f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 0.9f, 0.0f, 0.0f, 0.0f, 14), ib4.b(newColorScheme.m644getWhite0d7_KjU(), 1.0f, 0.0f, 0.0f, 0.0f, 14), null), baseColors.m595getBlack950d7_KjU(), ib4.b(baseColors.m590getBlack0d7_KjU(), 0.04f, 0.0f, 0.0f, 0.0f, 14), baseColors.m595getBlack950d7_KjU(), hpn.c(4293256677L), newColorScheme.m644getWhite0d7_KjU(), hpn.c(4294440951L), baseColors.m594getBlack900d7_KjU(), baseColors.m593getBlack700d7_KjU(), ib4.b(baseColors.m590getBlack0d7_KjU(), 0.02f, 0.0f, 0.0f, 0.0f, 14), ib4.b(baseColors.m590getBlack0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14), hpn.c(4292993505L), baseColors.m595getBlack950d7_KjU(), ib4.b(baseColors.m590getBlack0d7_KjU(), 0.05f, 0.0f, 0.0f, 0.0f, 14), hpn.c(4294375158L), baseColors.m599getRed0d7_KjU(), baseColors.m596getBlue0d7_KjU(), baseColors.m598getGreenLighter200d7_KjU(), baseColors.m599getRed0d7_KjU(), hpn.c(4279176975L), true, null);
    }

    public static final void setCurrentThemeMode(qqc qqcVar) {
        qqcVar.getClass();
        currentThemeMode = qqcVar;
    }

    public static final vb4 toMaterialColors(IntercomColors intercomColors) {
        intercomColors.getClass();
        if (intercomColors.isLight()) {
            return yb4.e(intercomColors.m737getAction0d7_KjU(), intercomColors.m752getOnAction0d7_KjU(), intercomColors.getBase().m701getBase0d7_KjU(), intercomColors.getText().m807getDefault0d7_KjU(), intercomColors.getBase().m701getBase0d7_KjU(), intercomColors.getText().m807getDefault0d7_KjU(), intercomColors.getBase().m701getBase0d7_KjU(), intercomColors.getText().m807getDefault0d7_KjU(), intercomColors.getBase().m701getBase0d7_KjU(), intercomColors.m749getError0d7_KjU(), -5234692);
        }
        long m737getAction0d7_KjU = intercomColors.m737getAction0d7_KjU();
        long m752getOnAction0d7_KjU = intercomColors.m752getOnAction0d7_KjU();
        long m701getBase0d7_KjU = intercomColors.getBase().m701getBase0d7_KjU();
        long m807getDefault0d7_KjU = intercomColors.getText().m807getDefault0d7_KjU();
        long m701getBase0d7_KjU2 = intercomColors.getBase().m701getBase0d7_KjU();
        long m807getDefault0d7_KjU2 = intercomColors.getText().m807getDefault0d7_KjU();
        long m701getBase0d7_KjU3 = intercomColors.getBase().m701getBase0d7_KjU();
        long m701getBase0d7_KjU4 = intercomColors.getBase().m701getBase0d7_KjU();
        long m807getDefault0d7_KjU3 = intercomColors.getText().m807getDefault0d7_KjU();
        long m749getError0d7_KjU = intercomColors.m749getError0d7_KjU();
        b57 b57Var = yb4.a;
        return new vb4(m737getAction0d7_KjU, m752getOnAction0d7_KjU, jb4.t, jb4.g, jb4.c, jb4.x, jb4.j, jb4.y, jb4.k, jb4.I, jb4.n, jb4.J, jb4.o, m701getBase0d7_KjU4, m807getDefault0d7_KjU3, m701getBase0d7_KjU, m807getDefault0d7_KjU, m701getBase0d7_KjU2, m807getDefault0d7_KjU2, m701getBase0d7_KjU3, jb4.d, jb4.b, m749getError0d7_KjU, jb4.e, jb4.a, jb4.f, jb4.r, jb4.s, jb4.w, jb4.B, jb4.H, jb4.C, jb4.D, jb4.E, jb4.F, jb4.G, jb4.u, jb4.v, jb4.h, jb4.i, jb4.z, jb4.A, jb4.l, jb4.m, jb4.K, jb4.L, jb4.p, jb4.q);
    }
}
