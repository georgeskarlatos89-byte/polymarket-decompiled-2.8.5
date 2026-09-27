package io.intercom.android.sdk.ui.coil;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.pdf.PdfRenderer;
import android.os.ParcelFileDescriptor;
import com.google.mlkit.vision.barcode.common.Barcode;
import com.socure.docv.capturesdk.api.Keys;
import defpackage.b9h;
import defpackage.d55;
import defpackage.dlc;
import defpackage.dmk;
import defpackage.ho9;
import defpackage.i5c;
import defpackage.kld;
import defpackage.lun;
import defpackage.mx5;
import defpackage.nfh;
import defpackage.nvm;
import defpackage.phg;
import defpackage.sx5;
import defpackage.tx5;
import defpackage.u85;
import defpackage.up9;
import io.intercom.android.sdk.ui.R;
import io.intercom.android.sdk.ui.extension.ContentTypeExtensionKt;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lio/intercom/android/sdk/ui/coil/PdfDecoder;", "Ltx5;", "Lup9;", "source", "Lkld;", "options", "<init>", "(Lup9;Lkld;)V", "Lmx5;", "decode", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lup9;", "Lkld;", "Factory", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PdfDecoder implements tx5 {
    public static final int $stable = 8;
    private final kld options;
    private final up9 source;

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00062\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lio/intercom/android/sdk/ui/coil/PdfDecoder$Factory;", "Lsx5;", "<init>", "()V", "", "mimeType", "", "isApplicable", "(Ljava/lang/String;)Z", "Lnfh;", Keys.KEY_SOCURE_RESULT, "Lkld;", "options", "Lho9;", "imageLoader", "Ltx5;", "create", "(Lnfh;Lkld;Lho9;)Ltx5;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "intercom-sdk-ui_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final class Factory implements sx5 {
        public static final int $stable = 0;

        private final boolean isApplicable(String mimeType) {
            if (mimeType != null) {
                return ContentTypeExtensionKt.isPdf(mimeType);
            }
            return false;
        }

        @Override // defpackage.sx5
        public tx5 create(nfh result, kld options, ho9 imageLoader) {
            result.getClass();
            options.getClass();
            imageLoader.getClass();
            if (!isApplicable(result.b)) {
                return null;
            }
            return new PdfDecoder(result.a, options);
        }

        public boolean equals(Object other) {
            return other instanceof Factory;
        }

        public int hashCode() {
            return Factory.class.hashCode();
        }
    }

    public PdfDecoder(up9 up9Var, kld kldVar) {
        up9Var.getClass();
        kldVar.getClass();
        this.source = up9Var;
        this.options = kldVar;
    }

    public static /* synthetic */ BitmapDrawable a(PdfDecoder pdfDecoder, Ref.a aVar) {
        return decode$lambda$5(pdfDecoder, aVar);
    }

    private static final BitmapDrawable decode$lambda$5(PdfDecoder pdfDecoder, Ref.a aVar) {
        int access$toPx;
        ParcelFileDescriptor open;
        int access$toPx2;
        int access$toPx3;
        ParcelFileDescriptor parcelFileDescriptor = null;
        try {
            try {
                open = ParcelFileDescriptor.open(pdfDecoder.source.e().toFile(), 268435456);
            } catch (Throwable th) {
                th = th;
            }
        } catch (SecurityException unused) {
        }
        try {
            boolean z = false;
            PdfRenderer.Page openPage = new PdfRenderer(open).openPage(0);
            openPage.getClass();
            int width = openPage.getWidth();
            int height = openPage.getHeight();
            kld kldVar = pdfDecoder.options;
            b9h b9hVar = kldVar.d;
            phg phgVar = kldVar.e;
            b9h b9hVar2 = b9h.c;
            if (Intrinsics.areEqual(b9hVar, b9hVar2)) {
                access$toPx2 = width;
            } else {
                access$toPx2 = PdfDecoderKt.access$toPx(b9hVar.a, phgVar);
            }
            kld kldVar2 = pdfDecoder.options;
            b9h b9hVar3 = kldVar2.d;
            phg phgVar2 = kldVar2.e;
            if (Intrinsics.areEqual(b9hVar3, b9hVar2)) {
                access$toPx3 = height;
            } else {
                access$toPx3 = PdfDecoderKt.access$toPx(b9hVar3.b, phgVar2);
            }
            if (width > 0 && height > 0 && (width != access$toPx2 || height != access$toPx3)) {
                double b = lun.b(width, height, access$toPx2, access$toPx3, pdfDecoder.options.e);
                if (b < 1.0d) {
                    z = true;
                }
                aVar.a = z;
                if (!z) {
                    if (!pdfDecoder.options.f) {
                    }
                }
                width = i5c.d(width * b);
                height = i5c.d(b * height);
            }
            Bitmap createBitmap = Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888);
            new Canvas(createBitmap).drawColor(-1);
            openPage.render(createBitmap, null, null, 1);
            Resources resources = pdfDecoder.options.a.getResources();
            resources.getClass();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(resources, createBitmap);
            if (open != null) {
                open.close();
            }
            return bitmapDrawable;
        } catch (SecurityException unused2) {
            parcelFileDescriptor = open;
            kld kldVar3 = pdfDecoder.options;
            b9h b9hVar4 = kldVar3.d;
            phg phgVar3 = kldVar3.e;
            b9h b9hVar5 = b9h.c;
            boolean areEqual = Intrinsics.areEqual(b9hVar4, b9hVar5);
            int i = Barcode.FORMAT_UPC_A;
            if (areEqual) {
                access$toPx = 512;
            } else {
                access$toPx = PdfDecoderKt.access$toPx(b9hVar4.a, phgVar3);
            }
            kld kldVar4 = pdfDecoder.options;
            b9h b9hVar6 = kldVar4.d;
            phg phgVar4 = kldVar4.e;
            if (!Intrinsics.areEqual(b9hVar6, b9hVar5)) {
                i = PdfDecoderKt.access$toPx(b9hVar6.b, phgVar4);
            }
            Bitmap createBitmap2 = Bitmap.createBitmap(access$toPx, i, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap2);
            canvas.drawColor(-1);
            Drawable g = d55.g(pdfDecoder.options.a, R.drawable.intercom_ic_document);
            if (g != null) {
                int min = Math.min(access$toPx, i) / 2;
                int i2 = (access$toPx - min) / 2;
                int i3 = (i - min) / 2;
                g.setBounds(i2, i3, i2 + min, min + i3);
                g.draw(canvas);
            }
            Resources resources2 = pdfDecoder.options.a.getResources();
            resources2.getClass();
            BitmapDrawable bitmapDrawable2 = new BitmapDrawable(resources2, createBitmap2);
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            return bitmapDrawable2;
        } catch (Throwable th2) {
            th = th2;
            parcelFileDescriptor = open;
            if (parcelFileDescriptor != null) {
                parcelFileDescriptor.close();
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.tx5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object decode(Continuation<? super mx5> continuation) {
        PdfDecoder$decode$1 pdfDecoder$decode$1;
        int i;
        Ref.a aVar;
        if (continuation instanceof PdfDecoder$decode$1) {
            pdfDecoder$decode$1 = (PdfDecoder$decode$1) continuation;
            int i2 = pdfDecoder$decode$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                pdfDecoder$decode$1.label = i2 - Integer.MIN_VALUE;
                Object obj = pdfDecoder$decode$1.result;
                u85 u85Var = u85.COROUTINE_SUSPENDED;
                i = pdfDecoder$decode$1.label;
                if (i == 0) {
                    if (i == 1) {
                        Ref.a aVar2 = (Ref.a) pdfDecoder$decode$1.L$0;
                        ResultKt.a(obj);
                        aVar = aVar2;
                    } else {
                        dmk.n("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                } else {
                    ResultKt.a(obj);
                    Object obj2 = new Object();
                    dlc dlcVar = new dlc(20, this, obj2);
                    pdfDecoder$decode$1.L$0 = obj2;
                    pdfDecoder$decode$1.label = 1;
                    Object c = nvm.c(dlcVar, pdfDecoder$decode$1);
                    if (c == u85Var) {
                        return u85Var;
                    }
                    obj = c;
                    aVar = obj2;
                }
                return new mx5((BitmapDrawable) obj, aVar.a);
            }
        }
        pdfDecoder$decode$1 = new PdfDecoder$decode$1(this, continuation);
        Object obj3 = pdfDecoder$decode$1.result;
        u85 u85Var2 = u85.COROUTINE_SUSPENDED;
        i = pdfDecoder$decode$1.label;
        if (i == 0) {
        }
        return new mx5((BitmapDrawable) obj3, aVar.a);
    }
}
