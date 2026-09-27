package io.intercom.android.sdk.ui.preview.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import defpackage.a66;
import defpackage.coc;
import defpackage.dmk;
import defpackage.mv6;
import defpackage.u85;
import io.getstream.chat.android.models.AttachmentType;
import io.intercom.android.sdk.ui.preview.data.IntercomPreviewFile;
import io.intercom.android.sdk.ui.preview.util.PdfOpenResult;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\u001a\u001e\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0006\u001a\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0080@¢\u0006\u0002\u0010\f\u001a\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0080@¢\u0006\u0002\u0010\u0006¨\u0006\u000f"}, d2 = {"openPdfFile", "Lio/intercom/android/sdk/ui/preview/util/PdfOpenResult;", "context", "Landroid/content/Context;", AttachmentType.FILE, "Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;", "(Landroid/content/Context;Lio/intercom/android/sdk/ui/preview/data/IntercomPreviewFile;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "renderPdfPages", "", "Landroid/graphics/Bitmap;", "fileDescriptor", "Landroid/os/ParcelFileDescriptor;", "(Landroid/os/ParcelFileDescriptor;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shouldOpenPdfInBrowser", "", "intercom-sdk-ui_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdfUtilsKt {
    public static final Object openPdfFile(Context context, IntercomPreviewFile intercomPreviewFile, Continuation<? super PdfOpenResult> continuation) {
        mv6 mv6Var = mv6.a;
        return coc.d(a66.c, new PdfUtilsKt$openPdfFile$2(intercomPreviewFile, context, null), continuation);
    }

    public static final Object renderPdfPages(ParcelFileDescriptor parcelFileDescriptor, Continuation<? super List<Bitmap>> continuation) {
        mv6 mv6Var = mv6.a;
        return coc.d(a66.c, new PdfUtilsKt$renderPdfPages$2(parcelFileDescriptor, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object shouldOpenPdfInBrowser(Context context, IntercomPreviewFile intercomPreviewFile, Continuation<? super Boolean> continuation) {
        PdfUtilsKt$shouldOpenPdfInBrowser$1 pdfUtilsKt$shouldOpenPdfInBrowser$1;
        int i;
        PdfOpenResult pdfOpenResult;
        if (continuation instanceof PdfUtilsKt$shouldOpenPdfInBrowser$1) {
            pdfUtilsKt$shouldOpenPdfInBrowser$1 = (PdfUtilsKt$shouldOpenPdfInBrowser$1) continuation;
            int i2 = pdfUtilsKt$shouldOpenPdfInBrowser$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfUtilsKt$shouldOpenPdfInBrowser$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfUtilsKt$shouldOpenPdfInBrowser$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = pdfUtilsKt$shouldOpenPdfInBrowser$1.label;
                boolean z = true;
                if (i == 0) {
                    if (i == 1) {
                        ResultKt.a(obj);
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    pdfUtilsKt$shouldOpenPdfInBrowser$1.label = 1;
                    obj = openPdfFile(context, intercomPreviewFile, pdfUtilsKt$shouldOpenPdfInBrowser$1);
                    if (obj == u85Var) {
                        return u85Var;
                    }
                }
                pdfOpenResult = (PdfOpenResult) obj;
                if (!(pdfOpenResult instanceof PdfOpenResult.PasswordProtected)) {
                    if (pdfOpenResult instanceof PdfOpenResult.Success) {
                        PdfOpenResult.Success success = (PdfOpenResult.Success) pdfOpenResult;
                        success.getFileDescriptor().close();
                        File tempFile = success.getTempFile();
                        if (tempFile != null) {
                            tempFile.delete();
                        }
                        z = false;
                    } else if (!(pdfOpenResult instanceof PdfOpenResult.Error)) {
                        dmk.a();
                        return null;
                    }
                }
                return Boolean.valueOf(z);
            }
        }
        pdfUtilsKt$shouldOpenPdfInBrowser$1 = new PdfUtilsKt$shouldOpenPdfInBrowser$1(continuation);
        Object obj2 = pdfUtilsKt$shouldOpenPdfInBrowser$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = pdfUtilsKt$shouldOpenPdfInBrowser$1.label;
        boolean z2 = true;
        if (i == 0) {
        }
        pdfOpenResult = (PdfOpenResult) obj2;
        if (!(pdfOpenResult instanceof PdfOpenResult.PasswordProtected)) {
        }
        return Boolean.valueOf(z2);
    }
}
