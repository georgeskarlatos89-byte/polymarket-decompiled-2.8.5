package io.intercom.android.sdk.m5.helpcenter.ui;

import defpackage.etc;
import defpackage.ktc;
import defpackage.oq4;
import defpackage.pq4;
import defpackage.pzc;
import defpackage.sr8;
import defpackage.sxe;
import defpackage.u80;
import defpackage.uwn;
import defpackage.xzc;
import io.intercom.android.sdk.m5.helpcenter.HelpCenterViewModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class HelpCenterScreenKt$HelpCenterNavGraph$1$1$1 implements Function4<u80, etc, pq4, Integer, Unit> {
    final /* synthetic */ List<String> $collectionIds;
    final /* synthetic */ pzc $navController;
    final /* synthetic */ HelpCenterViewModel $viewModel;

    public HelpCenterScreenKt$HelpCenterNavGraph$1$1$1(HelpCenterViewModel helpCenterViewModel, List<String> list, pzc pzcVar) {
        this.$viewModel = helpCenterViewModel;
        this.$collectionIds = list;
        this.$navController = pzcVar;
    }

    public static /* synthetic */ Unit a(pzc pzcVar, String str) {
        return invoke$lambda$5$lambda$4(pzcVar, str);
    }

    public static /* synthetic */ Unit b(xzc xzcVar) {
        return invoke$lambda$5$lambda$4$lambda$3(xzcVar);
    }

    public static /* synthetic */ Unit c(pzc pzcVar, String str) {
        return invoke$lambda$1$lambda$0(pzcVar, str);
    }

    private static final Unit invoke$lambda$1$lambda$0(pzc pzcVar, String str) {
        str.getClass();
        ktc.g(pzcVar, "COLLECTION_DETAILS/".concat(str), null, 6);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.jvm.functions.Function1] */
    private static final Unit invoke$lambda$5$lambda$4(pzc pzcVar, String str) {
        str.getClass();
        pzcVar.e("COLLECTION_DETAILS/" + str + "?startDestination=true", new Object());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [sxe, java.lang.Object] */
    private static final Unit invoke$lambda$5$lambda$4$lambda$3(xzc xzcVar) {
        xzcVar.getClass();
        xzcVar.b("COLLECTIONS");
        xzcVar.a(-1);
        ?? obj = new Object();
        invoke$lambda$5$lambda$4$lambda$3$lambda$2(obj);
        xzcVar.e = obj.a;
        xzcVar.f = false;
        return Unit.INSTANCE;
    }

    private static final Unit invoke$lambda$5$lambda$4$lambda$3$lambda$2(sxe sxeVar) {
        sxeVar.getClass();
        sxeVar.a = true;
        return Unit.INSTANCE;
    }

    public final void invoke(u80 u80Var, etc etcVar, pq4 pq4Var, int i) {
        u80Var.getClass();
        etcVar.getClass();
        HelpCenterViewModel helpCenterViewModel = this.$viewModel;
        List<String> list = this.$collectionIds;
        sr8 sr8Var = (sr8) pq4Var;
        sr8Var.e0(-2112966782);
        boolean j = sr8Var.j(this.$navController);
        pzc pzcVar = this.$navController;
        Object Q = sr8Var.Q();
        uwn uwnVar = oq4.a;
        if (j || Q == uwnVar) {
            Q = new d(pzcVar, 0);
            sr8Var.o0(Q);
        }
        Function1 function1 = (Function1) Q;
        sr8Var.s(false);
        sr8Var.e0(-2112960529);
        boolean j2 = sr8Var.j(this.$navController);
        pzc pzcVar2 = this.$navController;
        Object Q2 = sr8Var.Q();
        if (j2 || Q2 == uwnVar) {
            Q2 = new d(pzcVar2, 1);
            sr8Var.o0(Q2);
        }
        sr8Var.s(false);
        HelpCenterCollectionsScreenKt.HelpCenterCollectionsScreen(helpCenterViewModel, list, function1, (Function1) Q2, sr8Var, 0);
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(u80 u80Var, etc etcVar, pq4 pq4Var, Integer num) {
        invoke(u80Var, etcVar, pq4Var, num.intValue());
        return Unit.INSTANCE;
    }
}
