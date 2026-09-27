package io.intercom.android.sdk.ui.preview.util;

import defpackage.kw5;
import defpackage.q55;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
@kw5(c = "io.intercom.android.sdk.ui.preview.util.PdfUtilsKt", f = "PdfUtils.kt", l = {177}, m = "shouldOpenPdfInBrowser")
/* loaded from: classes6.dex */
public final class PdfUtilsKt$shouldOpenPdfInBrowser$1 extends q55 {
    int label;
    /* synthetic */ Object result;

    public PdfUtilsKt$shouldOpenPdfInBrowser$1(Continuation<? super PdfUtilsKt$shouldOpenPdfInBrowser$1> continuation) {
        super(continuation);
    }

    @Override // defpackage.l81
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return PdfUtilsKt.shouldOpenPdfInBrowser(null, null, this);
    }
}
