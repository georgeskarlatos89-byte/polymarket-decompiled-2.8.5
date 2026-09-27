package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class hp9 extends m1g {
    public static final float DEFAULT_IMAGE_BACKOFF_MULT = 2.0f;
    public static final int DEFAULT_IMAGE_MAX_RETRIES = 2;
    public static final int DEFAULT_IMAGE_TIMEOUT_MS = 1000;
    private static final Object sDecodeLock = new Object();
    private final Bitmap.Config mDecodeConfig;
    private x4g mListener;
    private final Object mLock;
    private final int mMaxHeight;
    private final int mMaxWidth;
    private final ImageView.ScaleType mScaleType;

    public hp9(String str, x4g x4gVar, ImageView.ScaleType scaleType, Bitmap.Config config, w4g w4gVar) {
        super(str, w4gVar);
        this.mLock = new Object();
        setRetryPolicy(new hc6(1000, 2, 2.0f));
        this.mListener = x4gVar;
        this.mDecodeConfig = config;
        this.mMaxWidth = 0;
        this.mMaxHeight = 0;
        this.mScaleType = scaleType;
    }

    public static int c(int i, int i2, int i3, int i4, ImageView.ScaleType scaleType) {
        if (i != 0 || i2 != 0) {
            if (scaleType == ImageView.ScaleType.FIT_XY) {
                if (i != 0) {
                    return i;
                }
            } else {
                if (i == 0) {
                    return (int) (i3 * (i2 / i4));
                }
                if (i2 != 0) {
                    double d = i4 / i3;
                    if (scaleType == ImageView.ScaleType.CENTER_CROP) {
                        double d2 = i2;
                        if (i * d < d2) {
                            return (int) (d2 / d);
                        }
                        return i;
                    }
                    double d3 = i2;
                    if (i * d > d3) {
                        return (int) (d3 / d);
                    }
                    return i;
                }
                return i;
            }
        }
        return i3;
    }

    public static int findBestSampleSize(int i, int i2, int i3, int i4) {
        double min = Math.min(i / i3, i2 / i4);
        float f = 1.0f;
        while (true) {
            float f2 = 2.0f * f;
            if (f2 <= min) {
                f = f2;
            } else {
                return (int) f;
            }
        }
    }

    public final z4g b(k3d k3dVar) {
        Bitmap bitmap;
        byte[] bArr = k3dVar.b;
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (this.mMaxWidth == 0 && this.mMaxHeight == 0) {
            options.inPreferredConfig = this.mDecodeConfig;
            bitmap = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
        } else {
            options.inJustDecodeBounds = true;
            BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            int i = options.outWidth;
            int i2 = options.outHeight;
            int c = c(this.mMaxWidth, this.mMaxHeight, i, i2, this.mScaleType);
            int c2 = c(this.mMaxHeight, this.mMaxWidth, i2, i, this.mScaleType);
            options.inJustDecodeBounds = false;
            options.inSampleSize = findBestSampleSize(i, i2, c, c2);
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length, options);
            if (decodeByteArray != null && (decodeByteArray.getWidth() > c || decodeByteArray.getHeight() > c2)) {
                bitmap = Bitmap.createScaledBitmap(decodeByteArray, c, c2, true);
                decodeByteArray.recycle();
            } else {
                bitmap = decodeByteArray;
            }
        }
        if (bitmap == null) {
            return new z4g(new cdk(k3dVar));
        }
        return new z4g(bitmap, c1m.b(k3dVar));
    }

    @Override // defpackage.m1g
    public void cancel() {
        super.cancel();
        synchronized (this.mLock) {
            this.mListener = null;
        }
    }

    public void deliverResponse(Bitmap bitmap) {
        x4g x4gVar;
        synchronized (this.mLock) {
            x4gVar = this.mListener;
        }
        if (x4gVar != null) {
            x4gVar.onResponse(bitmap);
        }
    }

    @Override // defpackage.m1g
    public j1g getPriority() {
        return j1g.LOW;
    }

    @Override // defpackage.m1g
    public z4g parseNetworkResponse(k3d k3dVar) {
        z4g b;
        synchronized (sDecodeLock) {
            try {
                try {
                    b = b(k3dVar);
                } catch (OutOfMemoryError e) {
                    fdk.b("Caught OOM for %d byte image, url=%s", Integer.valueOf(k3dVar.b.length), this.getUrl());
                    return new z4g(new cdk(e));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    @Override // defpackage.m1g
    public /* bridge */ /* synthetic */ void deliverResponse(Object obj) {
        deliverResponse((Bitmap) obj);
    }
}
