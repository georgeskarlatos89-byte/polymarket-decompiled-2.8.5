package com.socure.docv.capturesdk.feature.orchestrator.presentation.impl;

import com.socure.docv.capturesdk.common.network.model.stepup.UploadImage;
import com.socure.docv.capturesdk.feature.orchestrator.h;
import com.socure.docv.capturesdk.feature.orchestrator.l;
import com.socure.docv.capturesdk.feature.orchestrator.n;
import com.socure.docv.capturesdk.feature.orchestrator.o;
import com.socure.docv.capturesdk.feature.orchestrator.r;
import com.socure.docv.capturesdk.feature.orchestrator.s;
import com.socure.docv.capturesdk.models.c0;
import com.socure.docv.capturesdk.models.l0;
import defpackage.a7b;
import defpackage.dmk;
import defpackage.g85;
import defpackage.q55;
import defpackage.r5g;
import defpackage.u85;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import okhttp3.MultipartBody;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class a {
    public final a7b a;
    public final r b;
    public final com.socure.docv.capturesdk.feature.orchestrator.d c;
    public final g85 d;
    public final s e;
    public final /* synthetic */ int f;
    public final com.socure.docv.capturesdk.common.analytics.d g;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(a7b a7bVar, r rVar, com.socure.docv.capturesdk.feature.orchestrator.d dVar, g85 g85Var, s sVar, com.socure.docv.capturesdk.common.analytics.d dVar2, int i) {
        this(a7bVar, rVar, dVar, g85Var, sVar);
        this.f = i;
        rVar.getClass();
        dVar.getClass();
        g85Var.getClass();
        sVar.getClass();
        dVar2.getClass();
        switch (i) {
            case 1:
                this(a7bVar, rVar, dVar, g85Var, sVar);
                this.g = dVar2;
                return;
            case 2:
                this(a7bVar, rVar, dVar, g85Var, sVar);
                this.g = dVar2;
                return;
            case 3:
                this(a7bVar, rVar, dVar, g85Var, sVar);
                this.g = dVar2;
                return;
            case 4:
                this(a7bVar, rVar, dVar, g85Var, sVar);
                this.g = dVar2;
                return;
            default:
                this.g = dVar2;
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00b7, code lost:
    
        if (r9 == r1) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Object a(a aVar, UploadImage uploadImage, q55 q55Var) {
        e eVar;
        u85 u85Var;
        int i;
        io.sentry.config.a eVar2;
        Object b;
        s sVar;
        Object m882constructorimpl;
        Result result;
        Object obj;
        if (q55Var instanceof e) {
            eVar = (e) q55Var;
            int i2 = eVar.n;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eVar.n = i2 - Integer.MIN_VALUE;
                Object obj2 = eVar.l;
                u85Var = u85.COROUTINE_SUSPENDED;
                i = eVar.n;
                if (i == 0) {
                    if (i != 1) {
                        if (i == 2) {
                            result = (Result) eVar.k;
                            ResultKt.a(obj2);
                            obj = result.a;
                            if (obj instanceof r5g) {
                                Result.Companion companion = Result.INSTANCE;
                                c0 c0Var = (c0) obj;
                                c0Var.getClass();
                                return Result.m882constructorimpl((l0) c0Var);
                            }
                            return Result.m882constructorimpl(obj);
                        }
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    aVar = (a) eVar.k;
                    ResultKt.a(obj2);
                    b = ((Result) obj2).a;
                } else {
                    ResultKt.a(obj2);
                    com.socure.docv.capturesdk.feature.orchestrator.d dVar = aVar.c;
                    MultipartBody.Part documentBody = uploadImage.getDocumentBody();
                    if (documentBody != null) {
                        int i3 = aVar.f;
                        uploadImage.getClass();
                        switch (i3) {
                            case 0:
                                eVar2 = new com.socure.docv.capturesdk.feature.orchestrator.e(documentBody, uploadImage.getMetricsData(), uploadImage.getMultiframeImages(), uploadImage.getMultiframeParts());
                                break;
                            case 1:
                                eVar2 = new h(documentBody, uploadImage.getMetricsData(), uploadImage.getMultiframeImages(), uploadImage.getMultiframeParts());
                                break;
                            case 2:
                                eVar2 = new l(documentBody, uploadImage.getMetricsData(), uploadImage.getMultiframeImages(), uploadImage.getMultiframeParts());
                                break;
                            case 3:
                                eVar2 = new o(documentBody, uploadImage.getMetricsData(), uploadImage.getMultiframeImages(), uploadImage.getMultiframeParts());
                                break;
                            default:
                                eVar2 = new n(documentBody, uploadImage.getMetricsData(), uploadImage.getMultiframeImages(), uploadImage.getMultiframeParts());
                                break;
                        }
                        eVar.k = aVar;
                        eVar.n = 1;
                        b = dVar.b(eVar2, eVar);
                    } else {
                        dmk.v("Required value was null.");
                        return null;
                    }
                }
                Result result2 = new Result(b);
                sVar = aVar.e;
                if (!(b instanceof r5g)) {
                    b = Unit.INSTANCE;
                }
                m882constructorimpl = Result.m882constructorimpl(b);
                eVar.k = result2;
                eVar.n = 2;
                if (sVar.a(m882constructorimpl, eVar) != u85Var) {
                    result = result2;
                    obj = result.a;
                    if (obj instanceof r5g) {
                    }
                }
                return u85Var;
            }
        }
        eVar = new e(aVar, q55Var);
        Object obj22 = eVar.l;
        u85Var = u85.COROUTINE_SUSPENDED;
        i = eVar.n;
        if (i == 0) {
        }
        Result result22 = new Result(b);
        sVar = aVar.e;
        if (!(b instanceof r5g)) {
        }
        m882constructorimpl = Result.m882constructorimpl(b);
        eVar.k = result22;
        eVar.n = 2;
        if (sVar.a(m882constructorimpl, eVar) != u85Var) {
        }
        return u85Var;
    }

    public a(a7b a7bVar, r rVar, com.socure.docv.capturesdk.feature.orchestrator.d dVar, g85 g85Var, s sVar) {
        rVar.getClass();
        dVar.getClass();
        g85Var.getClass();
        sVar.getClass();
        this.a = a7bVar;
        this.b = rVar;
        this.c = dVar;
        this.d = g85Var;
        this.e = sVar;
    }
}
