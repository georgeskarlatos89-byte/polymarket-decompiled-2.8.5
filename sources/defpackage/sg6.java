package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.TextView;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArraySet;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class sg6 extends View {
    public int A;
    public long B;
    public int C;
    public Rect D;
    public final ValueAnimator E;
    public float F;
    public boolean G;
    public boolean H;
    public long I;
    public long J;
    public long K;
    public long L;
    public int M;
    public long[] N;
    public boolean[] O;
    public final Rect a;
    public final Rect b;
    public final Rect c;
    public final Rect d;
    public final Paint e;
    public final Paint f;
    public final Paint g;
    public final Paint h;
    public final Paint i;
    public final Paint j;
    public final Drawable k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final int p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final StringBuilder u;
    public final Formatter v;
    public final y85 w;
    public final CopyOnWriteArraySet x;
    public final Point y;
    public final float z;

    public sg6(Context context) {
        super(context, null, 0);
        this.a = new Rect();
        this.b = new Rect();
        this.c = new Rect();
        this.d = new Rect();
        Paint paint = new Paint();
        this.e = paint;
        Paint paint2 = new Paint();
        this.f = paint2;
        Paint paint3 = new Paint();
        this.g = paint3;
        Paint paint4 = new Paint();
        this.h = paint4;
        Paint paint5 = new Paint();
        this.i = paint5;
        Paint paint6 = new Paint();
        this.j = paint6;
        paint6.setAntiAlias(true);
        this.x = new CopyOnWriteArraySet();
        this.y = new Point();
        float f = context.getResources().getDisplayMetrics().density;
        this.z = f;
        this.t = a(f, -50);
        int a = a(f, 4);
        int a2 = a(f, 26);
        int a3 = a(f, 4);
        int a4 = a(f, 12);
        int a5 = a(f, 0);
        int a6 = a(f, 16);
        this.l = a;
        this.m = a2;
        this.n = 0;
        this.o = a3;
        this.p = a4;
        this.q = a5;
        this.r = a6;
        paint.setColor(-1);
        paint6.setColor(-1);
        paint2.setColor(-855638017);
        paint3.setColor(872415231);
        paint4.setColor(-1291845888);
        paint5.setColor(872414976);
        this.k = null;
        StringBuilder sb = new StringBuilder();
        this.u = sb;
        this.v = new Formatter(sb, Locale.getDefault());
        this.w = new y85(this, 10);
        this.s = (Math.max(a5, Math.max(a4, a6)) + 1) / 2;
        this.F = 1.0f;
        ValueAnimator valueAnimator = new ValueAnimator();
        this.E = valueAnimator;
        valueAnimator.addUpdateListener(new rg6(this, 0));
        this.J = -9223372036854775807L;
        this.B = -9223372036854775807L;
        this.A = 20;
        setFocusable(true);
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
    }

    public static int a(float f, int i) {
        return (int) ((i * f) + 0.5f);
    }

    private long getPositionIncrement() {
        long j = this.B;
        if (j == -9223372036854775807L) {
            long j2 = this.J;
            if (j2 == -9223372036854775807L) {
                return 0L;
            }
            return j2 / this.A;
        }
        return j;
    }

    private String getProgressText() {
        return u1k.A(this.u, this.v, this.K);
    }

    private long getScrubberPosition() {
        if (this.b.width() > 0 && this.J != -9223372036854775807L) {
            return (this.d.width() * this.J) / r0.width();
        }
        return 0L;
    }

    public final boolean b(long j) {
        long j2;
        long j3 = this.J;
        if (j3 > 0) {
            if (this.H) {
                j2 = this.I;
            } else {
                j2 = this.K;
            }
            long j4 = j2;
            long j5 = u1k.j(j4 + j, 0L, j3);
            if (j5 == j4) {
                return false;
            }
            if (!this.H) {
                c(j5);
            } else {
                f(j5);
            }
            e();
            return true;
        }
        return false;
    }

    public final void c(long j) {
        this.I = j;
        this.H = true;
        setPressed(true);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(true);
        }
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            oqe oqeVar = ((dqe) it.next()).a;
            oqeVar.C1 = true;
            TextView textView = oqeVar.D;
            if (textView != null) {
                textView.setText(u1k.A(oqeVar.F, oqeVar.G, j));
            }
            oqeVar.a.f();
        }
    }

    public final void d(boolean z) {
        bqe bqeVar;
        removeCallbacks(this.w);
        this.H = false;
        setPressed(false);
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(false);
        }
        invalidate();
        Iterator it = this.x.iterator();
        while (it.hasNext()) {
            dqe dqeVar = (dqe) it.next();
            long j = this.I;
            oqe oqeVar = dqeVar.a;
            oqeVar.C1 = false;
            if (!z && (bqeVar = oqeVar.w1) != null) {
                if (oqeVar.B1) {
                    ir7 ir7Var = (ir7) bqeVar;
                    if (ir7Var.q(17) && ir7Var.q(10)) {
                        v2j j2 = ir7Var.j();
                        int o = j2.o();
                        int i = 0;
                        while (true) {
                            long W = u1k.W(j2.m(i, oqeVar.I, 0L).m);
                            if (j < W) {
                                break;
                            }
                            if (i == o - 1) {
                                j = W;
                                break;
                            } else {
                                j -= W;
                                i++;
                            }
                        }
                        ir7Var.D(i, false, j);
                    }
                } else {
                    ir7 ir7Var2 = (ir7) bqeVar;
                    if (ir7Var2.q(5)) {
                        ir7Var2.D(ir7Var2.g(), false, j);
                    }
                }
                oqeVar.o();
            }
            oqeVar.a.g();
        }
    }

    @Override // android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    public final void e() {
        long j;
        Rect rect = this.c;
        Rect rect2 = this.b;
        rect.set(rect2);
        Rect rect3 = this.d;
        rect3.set(rect2);
        if (this.H) {
            j = this.I;
        } else {
            j = this.K;
        }
        if (this.J > 0) {
            rect.right = Math.min(rect2.left + ((int) ((rect2.width() * this.L) / this.J)), rect2.right);
            rect3.right = Math.min(rect2.left + ((int) ((rect2.width() * j) / this.J)), rect2.right);
        } else {
            int i = rect2.left;
            rect.right = i;
            rect3.right = i;
        }
        invalidate(this.a);
    }

    public final void f(long j) {
        if (this.I != j) {
            this.I = j;
            Iterator it = this.x.iterator();
            while (it.hasNext()) {
                oqe oqeVar = ((dqe) it.next()).a;
                TextView textView = oqeVar.D;
                if (textView != null) {
                    textView.setText(u1k.A(oqeVar.F, oqeVar.G, j));
                }
            }
        }
    }

    public long getPreferredUpdateDelay() {
        int width = (int) (this.b.width() / this.z);
        if (width != 0) {
            long j = this.J;
            if (j != 0 && j != -9223372036854775807L) {
                return j / width;
            }
            return Long.MAX_VALUE;
        }
        return Long.MAX_VALUE;
    }

    @Override // android.view.View
    public final void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.k;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        Paint paint;
        Canvas canvas2;
        int i;
        canvas.save();
        Rect rect = this.b;
        int height = rect.height();
        int centerY = rect.centerY() - (height / 2);
        int i2 = centerY + height;
        long j = this.J;
        Paint paint2 = this.g;
        Rect rect2 = this.d;
        if (j <= 0) {
            canvas2 = canvas;
            canvas2.drawRect(rect.left, centerY, rect.right, i2, paint2);
        } else {
            Rect rect3 = this.c;
            int i3 = rect3.left;
            int i4 = rect3.right;
            int max = Math.max(Math.max(rect.left, i4), rect2.right);
            int i5 = rect.right;
            if (max < i5) {
                canvas.drawRect(max, centerY, i5, i2, paint2);
            }
            int max2 = Math.max(i3, rect2.right);
            if (i4 > max2) {
                canvas.drawRect(max2, centerY, i4, i2, this.f);
            }
            if (rect2.width() > 0) {
                canvas.drawRect(rect2.left, centerY, rect2.right, i2, this.e);
            }
            if (this.M != 0) {
                long[] jArr = this.N;
                jArr.getClass();
                boolean[] zArr = this.O;
                zArr.getClass();
                int i6 = this.o;
                int i7 = i6 / 2;
                int i8 = 0;
                int i9 = 0;
                while (i9 < this.M) {
                    int min = Math.min(rect.width() - i6, Math.max(i8, ((int) ((rect.width() * u1k.j(jArr[i9], 0L, this.J)) / this.J)) - i7)) + rect.left;
                    if (zArr[i9]) {
                        paint = this.i;
                    } else {
                        paint = this.h;
                    }
                    Paint paint3 = paint;
                    int i10 = i9;
                    canvas.drawRect(min, centerY, min + i6, i2, paint3);
                    i9 = i10 + 1;
                    i8 = i8;
                }
            }
            canvas2 = canvas;
        }
        if (this.J > 0) {
            int i11 = u1k.i(rect2.right, rect2.left, rect.right);
            int centerY2 = rect2.centerY();
            Drawable drawable = this.k;
            if (drawable == null) {
                if (!this.H && !isFocused()) {
                    if (isEnabled()) {
                        i = this.p;
                    } else {
                        i = this.q;
                    }
                } else {
                    i = this.r;
                }
                canvas2.drawCircle(i11, centerY2, (int) ((i * this.F) / 2.0f), this.j);
            } else {
                int intrinsicWidth = ((int) (drawable.getIntrinsicWidth() * this.F)) / 2;
                int intrinsicHeight = ((int) (drawable.getIntrinsicHeight() * this.F)) / 2;
                drawable.setBounds(i11 - intrinsicWidth, centerY2 - intrinsicHeight, i11 + intrinsicWidth, centerY2 + intrinsicHeight);
                drawable.draw(canvas2);
            }
        }
        canvas2.restore();
    }

    @Override // android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (this.H && !z) {
            d(false);
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent.getEventType() == 4) {
            accessibilityEvent.getText().add(getProgressText());
        }
        accessibilityEvent.setClassName("android.widget.SeekBar");
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("android.widget.SeekBar");
        accessibilityNodeInfo.setContentDescription(getProgressText());
        if (this.J <= 0) {
            return;
        }
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_FORWARD);
        accessibilityNodeInfo.addAction(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_BACKWARD);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:5:0x000f. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001a  */
    @Override // android.view.View, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (isEnabled()) {
            long positionIncrement = getPositionIncrement();
            if (i != 66) {
                switch (i) {
                    case zh4.RECONNECTION_TIMED_OUT_DURING_UPDATE /* 21 */:
                        positionIncrement = -positionIncrement;
                        if (b(positionIncrement)) {
                            y85 y85Var = this.w;
                            removeCallbacks(y85Var);
                            postDelayed(y85Var, 1000L);
                            return true;
                        }
                        break;
                    case 22:
                        if (b(positionIncrement)) {
                        }
                        break;
                }
            }
            if (this.H) {
                d(false);
                return true;
            }
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        Rect rect;
        int i8 = i3 - i;
        int i9 = i4 - i2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = i8 - getPaddingRight();
        if (this.G) {
            i5 = 0;
        } else {
            i5 = this.s;
        }
        int i10 = this.n;
        int i11 = this.l;
        int i12 = this.m;
        if (i10 == 1) {
            i6 = (i9 - getPaddingBottom()) - i12;
            i7 = ((i9 - getPaddingBottom()) - i11) - Math.max(i5 - (i11 / 2), 0);
        } else {
            i6 = (i9 - i12) / 2;
            i7 = (i9 - i11) / 2;
        }
        Rect rect2 = this.a;
        rect2.set(paddingLeft, i6, paddingRight, i12 + i6);
        this.b.set(rect2.left + i5, i7, rect2.right - i5, i11 + i7);
        if (u1k.a >= 29 && ((rect = this.D) == null || rect.width() != i8 || this.D.height() != i9)) {
            Rect rect3 = new Rect(0, 0, i8, i9);
            this.D = rect3;
            setSystemGestureExclusionRects(Collections.singletonList(rect3));
        }
        e();
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        int i3 = this.m;
        if (mode == 0) {
            size = i3;
        } else if (mode != 1073741824) {
            size = Math.min(i3, size);
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i), size);
        Drawable drawable = this.k;
        if (drawable != null && drawable.isStateful() && drawable.setState(getDrawableState())) {
            invalidate();
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        Drawable drawable = this.k;
        if (drawable != null && u1k.a >= 23 && drawable.setLayoutDirection(i)) {
            invalidate();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        if (r3 != 3) goto L34;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z = false;
        if (isEnabled() && this.J > 0) {
            int x = (int) motionEvent.getX();
            int y = (int) motionEvent.getY();
            Point point = this.y;
            point.set(x, y);
            int i = point.x;
            int i2 = point.y;
            int action = motionEvent.getAction();
            Rect rect = this.b;
            Rect rect2 = this.d;
            if (action != 0) {
                if (action != 1) {
                    if (action == 2) {
                        if (this.H) {
                            if (i2 < this.t) {
                                int i3 = this.C;
                                rect2.right = u1k.i(ix2.c(i, i3, 3, i3), rect.left, rect.right);
                            } else {
                                this.C = i;
                                rect2.right = u1k.i(i, rect.left, rect.right);
                            }
                            f(getScrubberPosition());
                            e();
                            invalidate();
                            return true;
                        }
                    }
                }
                if (this.H) {
                    if (motionEvent.getAction() == 3) {
                        z = true;
                    }
                    d(z);
                    return true;
                }
            } else {
                int i4 = i;
                if (this.a.contains(i4, i2)) {
                    rect2.right = u1k.i(i4, rect.left, rect.right);
                    c(getScrubberPosition());
                    e();
                    invalidate();
                    return true;
                }
            }
        }
        return false;
    }

    @Override // android.view.View
    public final boolean performAccessibilityAction(int i, Bundle bundle) {
        if (super.performAccessibilityAction(i, bundle)) {
            return true;
        }
        if (this.J <= 0) {
            return false;
        }
        if (i == 8192) {
            if (b(-getPositionIncrement())) {
                d(false);
            }
        } else {
            if (i != 4096) {
                return false;
            }
            if (b(getPositionIncrement())) {
                d(false);
            }
        }
        sendAccessibilityEvent(4);
        return true;
    }

    public void setAdMarkerColor(int i) {
        this.h.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedColor(int i) {
        this.f.setColor(i);
        invalidate(this.a);
    }

    public void setBufferedPosition(long j) {
        if (this.L == j) {
            return;
        }
        this.L = j;
        e();
    }

    public void setDuration(long j) {
        if (this.J == j) {
            return;
        }
        this.J = j;
        if (this.H && j == -9223372036854775807L) {
            d(true);
        }
        e();
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        if (this.H && !z) {
            d(true);
        }
    }

    public void setKeyCountIncrement(int i) {
        boolean z;
        if (i > 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.A = i;
        this.B = -9223372036854775807L;
    }

    public void setKeyTimeIncrement(long j) {
        boolean z;
        if (j > 0) {
            z = true;
        } else {
            z = false;
        }
        pfn.b(z);
        this.A = -1;
        this.B = j;
    }

    public void setPlayedAdMarkerColor(int i) {
        this.i.setColor(i);
        invalidate(this.a);
    }

    public void setPlayedColor(int i) {
        this.e.setColor(i);
        invalidate(this.a);
    }

    public void setPosition(long j) {
        if (this.K == j) {
            return;
        }
        this.K = j;
        setContentDescription(getProgressText());
        e();
    }

    public void setScrubberColor(int i) {
        this.j.setColor(i);
        invalidate(this.a);
    }

    public void setUnplayedColor(int i) {
        this.g.setColor(i);
        invalidate(this.a);
    }
}
