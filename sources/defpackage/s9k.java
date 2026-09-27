package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import java.util.Arrays;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class s9k {
    public static final d9a w = new d9a(3);
    public int a;
    public final int b;
    public float[] d;
    public float[] e;
    public float[] f;
    public float[] g;
    public int[] h;
    public int[] i;
    public int[] j;
    public int k;
    public VelocityTracker l;
    public final float m;
    public final float n;
    public final int o;
    public final OverScroller p;
    public final r4n q;
    public View r;
    public boolean s;
    public final ViewGroup t;
    public d9a u;
    public int c = -1;
    public final in8 v = new in8(this, 23);

    public s9k(Context context, ViewGroup viewGroup, r4n r4nVar) {
        if (r4nVar != null) {
            this.t = viewGroup;
            this.q = r4nVar;
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            this.o = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
            this.b = viewConfiguration.getScaledTouchSlop();
            this.m = viewConfiguration.getScaledMaximumFlingVelocity();
            this.n = viewConfiguration.getScaledMinimumFlingVelocity();
            this.u = w;
            this.p = new OverScroller(context, new r9k(this));
            return;
        }
        dmk.s("Callback may not be null");
        throw null;
    }

    public final void a() {
        this.c = -1;
        float[] fArr = this.d;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.e, 0.0f);
            Arrays.fill(this.f, 0.0f);
            Arrays.fill(this.g, 0.0f);
            Arrays.fill(this.h, 0);
            Arrays.fill(this.i, 0);
            Arrays.fill(this.j, 0);
            this.k = 0;
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.l = null;
        }
    }

    public final void b(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.t;
        if (parent == viewGroup) {
            this.r = view;
            this.c = i;
            this.q.f(view, i);
            m(1);
            return;
        }
        fi9.p(viewGroup, ")", "captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view != null) {
            r4n r4nVar = this.q;
            if (r4nVar.d(view) > 0) {
                z = true;
            } else {
                z = false;
            }
            if (r4nVar.e() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            int i = this.b;
            if (z && z2) {
                if ((f2 * f2) + (f * f) > i * i) {
                }
            } else if (!z ? !(!z2 || Math.abs(f2) <= i) : Math.abs(f) > i) {
                return true;
            }
        }
        return false;
    }

    public final void d(int i) {
        float[] fArr = this.d;
        if (fArr != null) {
            int i2 = this.k;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.e[i] = 0.0f;
                this.f[i] = 0.0f;
                this.g[i] = 0.0f;
                this.h[i] = 0;
                this.i[i] = 0;
                this.j[i] = 0;
                this.k = (~i3) & i2;
            }
        }
    }

    public final int e(int i, int i2, int i3) {
        int abs;
        if (i == 0) {
            return 0;
        }
        float width = this.t.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / r3) - 0.5f) * 0.47123894f)) * width) + width;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final boolean f() {
        if (this.a == 2) {
            OverScroller overScroller = this.p;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.r.getLeft();
            int top = currY - this.r.getTop();
            if (left != 0) {
                View view = this.r;
                WeakHashMap weakHashMap = k9k.a;
                view.offsetLeftAndRight(left);
            }
            if (top != 0) {
                View view2 = this.r;
                WeakHashMap weakHashMap2 = k9k.a;
                view2.offsetTopAndBottom(top);
            }
            if (left != 0 || top != 0) {
                this.q.h(this.r, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.t.post(this.v);
            }
        }
        if (this.a != 2) {
            return false;
        }
        return true;
    }

    public final View g(int i, int i2) {
        ViewGroup viewGroup = this.t;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.q.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean h(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.r.getLeft();
        int top = this.r.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.p;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            m(0);
            return false;
        }
        View view = this.r;
        int i7 = (int) this.n;
        int i8 = (int) this.m;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            if (i3 > 0) {
                i3 = i8;
            } else {
                i3 = -i8;
            }
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            if (i4 > 0) {
                i4 = i8;
            } else {
                i4 = -i8;
            }
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i9;
        } else {
            f = abs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i9;
        } else {
            f3 = abs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        r4n r4nVar = this.q;
        this.u = w;
        overScroller.startScroll(left, top, i5, i6, (int) ((e(i6, i4, r4nVar.e()) * f6) + (e(i5, i3, r4nVar.d(view)) * f5)));
        m(2);
        return true;
    }

    public final void i(MotionEvent motionEvent) {
        int findPointerIndex;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.l = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                r4n r4nVar = this.q;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.a == 1 && pointerId == this.c) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.c) {
                                                View g = g((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.r;
                                                if (g == view && p(view, pointerId2)) {
                                                    i = this.c;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        j();
                                    }
                                }
                                d(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        k(x, y, pointerId3);
                        if (this.a == 0) {
                            p(g((int) x, (int) y), pointerId3);
                            int i3 = this.h[pointerId3];
                            return;
                        }
                        int i4 = (int) x;
                        int i5 = (int) y;
                        View view2 = this.r;
                        if (view2 != null && i4 >= view2.getLeft() && i4 < view2.getRight() && i5 >= view2.getTop() && i5 < view2.getBottom()) {
                            p(this.r, pointerId3);
                            return;
                        }
                        return;
                    }
                    if (this.a == 1) {
                        this.s = true;
                        r4nVar.i(this.r, 0.0f, 0.0f);
                        this.s = false;
                        if (this.a == 1) {
                            m(0);
                        }
                    }
                    a();
                    return;
                }
                if (this.a == 1) {
                    int i6 = this.c;
                    if ((this.k & (1 << i6)) == 0 || (findPointerIndex = motionEvent.findPointerIndex(i6)) == -1) {
                        return;
                    }
                    float x2 = motionEvent.getX(findPointerIndex);
                    float y2 = motionEvent.getY(findPointerIndex);
                    float[] fArr = this.f;
                    int i7 = this.c;
                    int i8 = (int) (x2 - fArr[i7]);
                    int i9 = (int) (y2 - this.g[i7]);
                    int left = this.r.getLeft() + i8;
                    int top = this.r.getTop() + i9;
                    int left2 = this.r.getLeft();
                    int top2 = this.r.getTop();
                    if (i8 != 0) {
                        left = r4nVar.a(this.r, left);
                        WeakHashMap weakHashMap = k9k.a;
                        this.r.offsetLeftAndRight(left - left2);
                    }
                    if (i9 != 0) {
                        top = r4nVar.b(this.r, top);
                        WeakHashMap weakHashMap2 = k9k.a;
                        this.r.offsetTopAndBottom(top - top2);
                    }
                    if (i8 != 0 || i9 != 0) {
                        r4nVar.h(this.r, left, top);
                    }
                } else {
                    int pointerCount2 = motionEvent.getPointerCount();
                    while (i2 < pointerCount2) {
                        int pointerId4 = motionEvent.getPointerId(i2);
                        if ((this.k & (1 << pointerId4)) != 0) {
                            float x3 = motionEvent.getX(i2);
                            float y3 = motionEvent.getY(i2);
                            float f = x3 - this.d[pointerId4];
                            float f2 = y3 - this.e[pointerId4];
                            Math.abs(f);
                            Math.abs(f2);
                            int i10 = this.h[pointerId4];
                            Math.abs(f2);
                            Math.abs(f);
                            int i11 = this.h[pointerId4];
                            Math.abs(f);
                            Math.abs(f2);
                            int i12 = this.h[pointerId4];
                            Math.abs(f2);
                            Math.abs(f);
                            int i13 = this.h[pointerId4];
                            if (this.a != 1) {
                                View g2 = g((int) x3, (int) y3);
                                if (c(g2, f, f2) && p(g2, pointerId4)) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                        i2++;
                    }
                }
                l(motionEvent);
                return;
            }
            if (this.a == 1) {
                j();
            }
            a();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View g3 = g((int) x4, (int) y4);
        k(x4, y4, pointerId5);
        p(g3, pointerId5);
        int i14 = this.h[pointerId5];
    }

    public final void j() {
        VelocityTracker velocityTracker = this.l;
        float f = this.m;
        velocityTracker.computeCurrentVelocity(1000, f);
        float xVelocity = this.l.getXVelocity(this.c);
        float abs = Math.abs(xVelocity);
        float f2 = this.n;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.l.getYVelocity(this.c);
        float abs2 = Math.abs(yVelocity);
        if (abs2 < f2) {
            f = 0.0f;
        } else if (abs2 > f) {
            if (yVelocity <= 0.0f) {
                f = -f;
            }
        } else {
            f = yVelocity;
        }
        this.s = true;
        this.q.i(this.r, xVelocity, f);
        this.s = false;
        if (this.a == 1) {
            m(0);
        }
    }

    public final void k(float f, float f2, int i) {
        float[] fArr = this.d;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.e;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.f;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.g;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.h;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.i;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.j;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.d = fArr2;
            this.e = fArr3;
            this.f = fArr4;
            this.g = fArr5;
            this.h = iArr;
            this.i = iArr2;
            this.j = iArr3;
            fArr = fArr2;
        }
        this.f[i] = f;
        fArr[i] = f;
        float[] fArr9 = this.e;
        this.g[i] = f2;
        fArr9[i] = f2;
        int[] iArr7 = this.h;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.t;
        int left = viewGroup.getLeft();
        int i6 = this.o;
        if (i4 < left + i6) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + i6) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.k |= 1 << i;
    }

    public final void l(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.k & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.f[pointerId] = x;
                this.g[pointerId] = y;
            }
        }
    }

    public final void m(int i) {
        this.t.removeCallbacks(this.v);
        if (this.a != i) {
            this.a = i;
            this.q.g(i);
            if (this.a == 0) {
                this.r = null;
            }
        }
    }

    public final boolean n(int i, int i2) {
        if (this.s) {
            return h(i, i2, (int) this.l.getXVelocity(this.c), (int) this.l.getYVelocity(this.c));
        }
        dmk.n("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00c3, code lost:
    
        if (r12 != r11) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean o(MotionEvent motionEvent) {
        View g;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            a();
        }
        VelocityTracker velocityTracker = this.l;
        if (velocityTracker == null) {
            velocityTracker = VelocityTracker.obtain();
            this.l = velocityTracker;
        }
        velocityTracker.addMovement(motionEvent);
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                d(motionEvent.getPointerId(actionIndex));
                            }
                        } else {
                            int pointerId = motionEvent.getPointerId(actionIndex);
                            float x = motionEvent.getX(actionIndex);
                            float y = motionEvent.getY(actionIndex);
                            k(x, y, pointerId);
                            int i = this.a;
                            if (i == 0) {
                                int i2 = this.h[pointerId];
                            } else if (i == 2 && (g = g((int) x, (int) y)) == this.r) {
                                p(g, pointerId);
                            }
                        }
                    }
                } else if (this.d != null && this.e != null) {
                    int pointerCount = motionEvent.getPointerCount();
                    for (int i3 = 0; i3 < pointerCount; i3++) {
                        int pointerId2 = motionEvent.getPointerId(i3);
                        if ((this.k & (1 << pointerId2)) != 0) {
                            float x2 = motionEvent.getX(i3);
                            float y2 = motionEvent.getY(i3);
                            float f = x2 - this.d[pointerId2];
                            float f2 = y2 - this.e[pointerId2];
                            View g2 = g((int) x2, (int) y2);
                            boolean c = c(g2, f, f2);
                            if (c) {
                                int left = g2.getLeft();
                                r4n r4nVar = this.q;
                                int a = r4nVar.a(g2, ((int) f) + left);
                                int top = g2.getTop();
                                int b = r4nVar.b(g2, ((int) f2) + top);
                                int d = r4nVar.d(g2);
                                int e = r4nVar.e();
                                if (d != 0) {
                                    if (d > 0) {
                                    }
                                }
                                if (e == 0) {
                                    break;
                                }
                                if (e > 0 && b == top) {
                                    break;
                                }
                            }
                            Math.abs(f);
                            Math.abs(f2);
                            int i4 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i5 = this.h[pointerId2];
                            Math.abs(f);
                            Math.abs(f2);
                            int i6 = this.h[pointerId2];
                            Math.abs(f2);
                            Math.abs(f);
                            int i7 = this.h[pointerId2];
                            if (this.a == 1) {
                                break;
                            }
                            if (c && p(g2, pointerId2)) {
                                break;
                            }
                        }
                    }
                    l(motionEvent);
                }
            }
            a();
        } else {
            float x3 = motionEvent.getX();
            float y3 = motionEvent.getY();
            int pointerId3 = motionEvent.getPointerId(0);
            k(x3, y3, pointerId3);
            View g3 = g((int) x3, (int) y3);
            if (g3 == this.r && this.a == 2) {
                p(g3, pointerId3);
            }
            int i8 = this.h[pointerId3];
        }
        if (this.a != 1) {
            return false;
        }
        return true;
    }

    public final boolean p(View view, int i) {
        if (view == this.r && this.c == i) {
            return true;
        }
        if (view != null && this.q.j(view, i)) {
            this.c = i;
            b(view, i);
            return true;
        }
        return false;
    }
}
