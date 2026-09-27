package androidx.camera.view;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import defpackage.d55;
import defpackage.ebk;
import defpackage.f3f;
import defpackage.gpc;
import defpackage.i9k;
import defpackage.in9;
import defpackage.jyi;
import defpackage.k9k;
import defpackage.kbj;
import defpackage.lei;
import defpackage.llf;
import defpackage.mfc;
import defpackage.mod;
import defpackage.njg;
import defpackage.o3f;
import defpackage.o9n;
import defpackage.olb;
import defpackage.omf;
import defpackage.oq6;
import defpackage.q03;
import defpackage.q3f;
import defpackage.qp7;
import defpackage.r3f;
import defpackage.rn6;
import defpackage.s3f;
import defpackage.s93;
import defpackage.t3f;
import defpackage.u3f;
import defpackage.v3f;
import defpackage.x03;
import defpackage.xbc;
import defpackage.xkm;
import defpackage.yej;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class PreviewView extends FrameLayout {
    public static final r3f m = r3f.PERFORMANCE;
    public r3f a;
    public u3f b;
    public final njg c;
    public final o3f d;
    public boolean e;
    public final gpc f;
    public final AtomicReference g;
    public final v3f h;
    public x03 i;
    public final q3f j;
    public final s93 k;
    public final rn6 l;

    /* JADX WARN: Type inference failed for: r0v1, types: [olb, gpc] */
    /* JADX WARN: Type inference failed for: r10v11, types: [android.view.View, njg] */
    /* JADX WARN: Type inference failed for: r8v0, types: [o3f, java.lang.Object] */
    public PreviewView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0, 0);
        r3f r3fVar = m;
        this.a = r3fVar;
        ?? obj = new Object();
        obj.h = o3f.i;
        this.d = obj;
        this.e = true;
        this.f = new olb(t3f.IDLE);
        this.g = new AtomicReference();
        this.h = new v3f(obj);
        this.j = new q3f(this);
        this.k = new s93(this, 4);
        this.l = new rn6(this);
        xkm.a();
        Resources.Theme theme = context.getTheme();
        int[] iArr = llf.a;
        TypedArray obtainStyledAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
        WeakHashMap weakHashMap = k9k.a;
        i9k.b(this, context, iArr, attributeSet, obtainStyledAttributes, 0, 0);
        try {
            setScaleType(s3f.a(obtainStyledAttributes.getInteger(1, obj.h.b())));
            setImplementationMode(r3f.a(obtainStyledAttributes.getInteger(0, r3fVar.b())));
            obtainStyledAttributes.recycle();
            new yej(context, new xbc(25));
            if (getBackground() == null) {
                setBackgroundColor(d55.d(getContext(), R.color.black));
            }
            ?? view = new View(context, null, 0, 0);
            view.setBackgroundColor(-1);
            view.setAlpha(0.0f);
            view.setElevation(Float.MAX_VALUE);
            this.c = view;
            view.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }

    public static boolean b(lei leiVar, r3f r3fVar) {
        boolean z;
        boolean equals = leiVar.d.j().p().equals("androidx.camera.camera2.legacy");
        if (oq6.a.f(SurfaceViewStretchedQuirk.class) == null && oq6.a.f(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z = false;
        } else {
            z = true;
        }
        if (!equals && !z) {
            int ordinal = r3fVar.ordinal();
            if (ordinal == 0) {
                return false;
            }
            if (ordinal != 1) {
                qp7.k(r3fVar, "Invalid implementation mode: ");
                return false;
            }
        }
        return true;
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private in9 getScreenFlashInternal() {
        return this.c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int ordinal = getScaleType().ordinal();
        if (ordinal != 0) {
            int i = 1;
            if (ordinal != 1) {
                i = 2;
                if (ordinal != 2) {
                    i = 3;
                    if (ordinal != 3 && ordinal != 4 && ordinal != 5) {
                        omf.q(getScaleType(), "Unexpected scale type: ");
                        return 0;
                    }
                }
            }
            return i;
        }
        return 0;
    }

    private void setScreenFlashUiInfo(in9 in9Var) {
        o9n.e(3, "PreviewView");
    }

    public final void a() {
        Rect rect;
        Display defaultDisplay;
        x03 x03Var;
        xkm.a();
        if (this.b != null) {
            if (this.e && (defaultDisplay = getDefaultDisplay()) != null && (x03Var = this.i) != null) {
                o3f o3fVar = this.d;
                int q = x03Var.q(defaultDisplay.getRotation());
                int rotation = defaultDisplay.getRotation();
                if (o3fVar.g) {
                    o3fVar.c = q;
                    o3fVar.e = rotation;
                }
            }
            this.b.f();
        }
        v3f v3fVar = this.h;
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        v3fVar.getClass();
        xkm.a();
        synchronized (v3fVar) {
            try {
                if (size.getWidth() != 0 && size.getHeight() != 0 && (rect = v3fVar.b) != null) {
                    v3fVar.a.a(size, layoutDirection, rect);
                }
            } finally {
            }
        }
    }

    public Bitmap getBitmap() {
        xkm.a();
        u3f u3fVar = this.b;
        if (u3fVar != null) {
            FrameLayout frameLayout = u3fVar.b;
            Bitmap b = u3fVar.b();
            if (b == null) {
                return null;
            }
            o3f o3fVar = u3fVar.c;
            Size size = new Size(frameLayout.getWidth(), frameLayout.getHeight());
            int layoutDirection = frameLayout.getLayoutDirection();
            if (!o3fVar.f()) {
                return b;
            }
            Matrix d = o3fVar.d();
            RectF e = o3fVar.e(size, layoutDirection);
            Bitmap createBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), b.getConfig());
            Canvas canvas = new Canvas(createBitmap);
            Matrix matrix = new Matrix();
            matrix.postConcat(d);
            matrix.postScale(e.width() / o3fVar.a.getWidth(), e.height() / o3fVar.a.getHeight());
            matrix.postTranslate(e.left, e.top);
            canvas.drawBitmap(b, matrix, new Paint(7));
            return createBitmap;
        }
        return null;
    }

    public q03 getController() {
        xkm.a();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        if (display != null) {
            return display;
        }
        return getDisplay();
    }

    public r3f getImplementationMode() {
        xkm.a();
        return this.a;
    }

    public mfc getMeteringPointFactory() {
        xkm.a();
        return this.h;
    }

    /* JADX WARN: Type inference failed for: r7v5, types: [mod, java.lang.Object] */
    public mod getOutputTransform() {
        Matrix matrix;
        o3f o3fVar = this.d;
        xkm.a();
        try {
            matrix = o3fVar.c(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrix = null;
        }
        Rect rect = o3fVar.b;
        if (matrix != null && rect != null) {
            RectF rectF = kbj.a;
            RectF rectF2 = new RectF(rect);
            Matrix matrix2 = new Matrix();
            matrix2.setRectToRect(kbj.a, rectF2, Matrix.ScaleToFit.FILL);
            matrix.preConcat(matrix2);
            if (this.b instanceof jyi) {
                matrix.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                o9n.f("PreviewView", "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            new Size(rect.width(), rect.height());
            return new Object();
        }
        o9n.e(3, "PreviewView");
        return null;
    }

    public olb getPreviewStreamState() {
        return this.f;
    }

    public s3f getScaleType() {
        xkm.a();
        return this.d.h;
    }

    public in9 getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        xkm.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Size size = new Size(getWidth(), getHeight());
        int layoutDirection = getLayoutDirection();
        o3f o3fVar = this.d;
        if (!o3fVar.f()) {
            return null;
        }
        Matrix matrix = new Matrix(o3fVar.d);
        matrix.postConcat(o3fVar.c(size, layoutDirection));
        return matrix;
    }

    public f3f getSurfaceProvider() {
        xkm.a();
        return this.l;
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ebk] */
    public ebk getViewPort() {
        xkm.a();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        int rotation = defaultDisplay.getRotation();
        xkm.a();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        Rational rational = new Rational(getWidth(), getHeight());
        int viewPortScaleType = getViewPortScaleType();
        int layoutDirection = getLayoutDirection();
        ?? obj = new Object();
        obj.a = viewPortScaleType;
        obj.b = rational;
        obj.c = rotation;
        obj.d = layoutDirection;
        return obj;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        DisplayManager displayManager;
        super.onAttachedToWindow();
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.registerDisplayListener(this.j, new Handler(Looper.getMainLooper()));
        }
        addOnLayoutChangeListener(this.k);
        u3f u3fVar = this.b;
        if (u3fVar != null) {
            u3fVar.c();
        }
        xkm.a();
        getViewPort();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        DisplayManager displayManager;
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.k);
        u3f u3fVar = this.b;
        if (u3fVar != null) {
            u3fVar.d();
        }
        if (!isInEditMode() && (displayManager = getDisplayManager()) != null) {
            displayManager.unregisterDisplayListener(this.j);
        }
    }

    public void setController(q03 q03Var) {
        xkm.a();
        xkm.a();
        getViewPort();
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(r3f r3fVar) {
        xkm.a();
        this.a = r3fVar;
    }

    public void setScaleType(s3f s3fVar) {
        xkm.a();
        this.d.h = s3fVar;
        a();
        xkm.a();
        getViewPort();
    }

    public void setScreenFlashOverlayColor(int i) {
        this.c.setBackgroundColor(i);
    }

    public void setScreenFlashWindow(Window window) {
        xkm.a();
        this.c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }
}
