package io.intercom.android.sdk.ui.preview.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import defpackage.dmk;
import defpackage.kw5;
import defpackage.t85;
import defpackage.u85;
import defpackage.zei;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lt85;", "", "Landroid/graphics/Bitmap;", "<anonymous>", "(Lt85;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0})
@kw5(c = "io.intercom.android.sdk.ui.preview.util.PdfUtilsKt$renderPdfPages$2", f = "PdfUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes6.dex */
public final class PdfUtilsKt$renderPdfPages$2 extends zei implements Function2<t85, Continuation<? super List<Bitmap>>, Object> {
    final /* synthetic */ ParcelFileDescriptor $fileDescriptor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PdfUtilsKt$renderPdfPages$2(ParcelFileDescriptor parcelFileDescriptor, Continuation<? super PdfUtilsKt$renderPdfPages$2> continuation) {
        super(2, continuation);
        this.$fileDescriptor = parcelFileDescriptor;
    }

    @Override // defpackage.l81
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new PdfUtilsKt$renderPdfPages$2(this.$fileDescriptor, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(t85 t85Var, Continuation<? super List<Bitmap>> continuation) {
        return ((PdfUtilsKt$renderPdfPages$2) create(t85Var, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        u85 u85Var = u85.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            ResultKt.a(obj);
            ArrayList arrayList = new ArrayList();
            PdfRenderer pdfRenderer = new PdfRenderer(this.$fileDescriptor);
            try {
                int pageCount = pdfRenderer.getPageCount();
                for (int i = 0; i < pageCount; i++) {
                    PdfRenderer.Page openPage = pdfRenderer.openPage(i);
                    openPage.getClass();
                    Bitmap createBitmap = Bitmap.createBitmap(openPage.getWidth(), openPage.getHeight(), Bitmap.Config.ARGB_8888);
                    new Canvas(createBitmap).drawColor(-1);
                    openPage.render(createBitmap, null, null, 1);
                    arrayList.add(createBitmap);
                    openPage.close();
                }
                return arrayList;
            } finally {
                pdfRenderer.close();
            }
        }
        dmk.n("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(t85 t85Var, Continuation<? super List<Bitmap>> continuation) {
        return invoke2(t85Var, continuation);
    }
}
