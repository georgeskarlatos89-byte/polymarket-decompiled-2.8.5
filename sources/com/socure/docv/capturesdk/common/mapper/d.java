package com.socure.docv.capturesdk.common.mapper;

import com.fingerprintjs.android.fpjs_pro_internal.f3;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Config;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Customization;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.Theme;
import com.socure.docv.capturesdk.models.m;
import com.socure.docv.capturesdk.models.x0;
import defpackage.dmk;
import defpackage.q55;
import defpackage.u85;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class d {
    public final f3 a;
    public final io.sentry.hints.j b;

    public d(f3 f3Var, io.sentry.hints.j jVar) {
        this.a = f3Var;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x006b, code lost:
    
        if (r2 == r4) goto L68;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Customization customization, q55 q55Var) {
        c cVar;
        u85 u85Var;
        int i;
        String str;
        Theme theme;
        String str2;
        int i2;
        Config config;
        com.socure.docv.capturesdk.models.k kVar;
        String str3;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        x0 x0Var;
        String str4;
        int i3;
        Boolean simplifiedImageUploadUX;
        Boolean replaceCompletionIconWithLoading;
        Boolean swapPrimarySecondaryButtons;
        Boolean removeIdCheckLogo;
        d dVar = this;
        Customization customization2 = customization;
        if (q55Var instanceof c) {
            cVar = (c) q55Var;
            int i4 = cVar.p;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                cVar.p = i4 - Integer.MIN_VALUE;
                Object obj = cVar.n;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = cVar.p;
                boolean z6 = false;
                str = null;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            i3 = cVar.m;
                            str4 = (String) cVar.l;
                            x0Var = (x0) cVar.k;
                            ResultKt.a(obj);
                            com.socure.docv.capturesdk.models.k kVar2 = (com.socure.docv.capturesdk.models.k) obj;
                            if (i3 != 0) {
                                z6 = true;
                            }
                            return new m(x0Var, str4, z6, kVar2);
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    Customization customization3 = (Customization) cVar.l;
                    d dVar2 = (d) cVar.k;
                    ResultKt.a(obj);
                    customization2 = customization3;
                    dVar = dVar2;
                } else {
                    ResultKt.a(obj);
                    if (customization2 != null) {
                        theme = customization2.getTheme();
                    } else {
                        theme = null;
                    }
                    cVar.k = dVar;
                    cVar.l = customization2;
                    cVar.p = 1;
                    obj = dVar.a.c(theme, cVar);
                }
                x0 x0Var2 = (x0) obj;
                if (customization2 == null) {
                    str2 = customization2.getLogo();
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                if (customization2 == null) {
                    i2 = Intrinsics.areEqual(customization2.isLogoCustomized(), Boolean.TRUE);
                } else {
                    i2 = 0;
                }
                io.sentry.hints.j jVar = dVar.b;
                if (customization2 == null) {
                    config = customization2.getConfig();
                } else {
                    config = null;
                }
                cVar.k = x0Var2;
                cVar.l = str2;
                cVar.m = i2;
                cVar.p = 2;
                if (config != null) {
                    str = config.getImageThemeColor();
                }
                if (str != null) {
                    str3 = "";
                } else {
                    str3 = str;
                }
                if (config == null) {
                    z = Intrinsics.areEqual(config.getProgressBar(), Boolean.TRUE);
                } else {
                    z = false;
                }
                if (config == null && (removeIdCheckLogo = config.getRemoveIdCheckLogo()) != null) {
                    z2 = removeIdCheckLogo.booleanValue();
                } else {
                    z2 = false;
                }
                if (config == null && (swapPrimarySecondaryButtons = config.getSwapPrimarySecondaryButtons()) != null) {
                    z3 = swapPrimarySecondaryButtons.booleanValue();
                } else {
                    z3 = false;
                }
                if (config == null && (replaceCompletionIconWithLoading = config.getReplaceCompletionIconWithLoading()) != null) {
                    z4 = replaceCompletionIconWithLoading.booleanValue();
                } else {
                    z4 = false;
                }
                if (config == null && (simplifiedImageUploadUX = config.getSimplifiedImageUploadUX()) != null) {
                    z5 = simplifiedImageUploadUX.booleanValue();
                } else {
                    z5 = false;
                }
                kVar = new com.socure.docv.capturesdk.models.k(str3, z, z2, z3, z4, z5);
                if (kVar != u85Var) {
                    x0Var = x0Var2;
                    str4 = str2;
                    i3 = i2;
                    obj = kVar;
                    com.socure.docv.capturesdk.models.k kVar22 = (com.socure.docv.capturesdk.models.k) obj;
                    if (i3 != 0) {
                    }
                    return new m(x0Var, str4, z6, kVar22);
                }
                return u85Var;
            }
        }
        cVar = new c(dVar, q55Var);
        Object obj2 = cVar.n;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = cVar.p;
        boolean z62 = false;
        str = null;
        if (i == 0) {
        }
        x0 x0Var22 = (x0) obj2;
        if (customization2 == null) {
        }
        if (str2 == null) {
        }
        if (customization2 == null) {
        }
        io.sentry.hints.j jVar2 = dVar.b;
        if (customization2 == null) {
        }
        cVar.k = x0Var22;
        cVar.l = str2;
        cVar.m = i2;
        cVar.p = 2;
        if (config != null) {
        }
        if (str != null) {
        }
        if (config == null) {
        }
        if (config == null) {
        }
        z2 = false;
        if (config == null) {
        }
        z3 = false;
        if (config == null) {
        }
        z4 = false;
        if (config == null) {
        }
        z5 = false;
        kVar = new com.socure.docv.capturesdk.models.k(str3, z, z2, z3, z4, z5);
        if (kVar != u85Var) {
        }
        return u85Var;
    }
}
