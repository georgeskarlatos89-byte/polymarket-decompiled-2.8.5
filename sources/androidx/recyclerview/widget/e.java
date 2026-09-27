package androidx.recyclerview.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import defpackage.b7;
import defpackage.b7h;
import defpackage.ba6;
import defpackage.c7;
import defpackage.d7;
import defpackage.dmk;
import defpackage.elf;
import defpackage.etf;
import defpackage.gg1;
import defpackage.htf;
import defpackage.k9k;
import defpackage.rn6;
import defpackage.ssf;
import defpackage.tsf;
import defpackage.v14;
import defpackage.x8j;
import defpackage.z8b;
import defpackage.z8k;
import defpackage.z9k;
import defpackage.zcf;
import defpackage.zcg;
import io.sentry.android.core.m0;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public abstract class e {
    public x8j a;
    public RecyclerView b;
    public final zcg c;
    public final zcg d;
    public z8b e;
    public boolean f;
    public boolean g;
    public final boolean h;
    public final boolean i;
    public int j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;

    public e() {
        zcf zcfVar = new zcf(this, 3);
        ba6 ba6Var = new ba6(this, 28);
        this.c = new zcg((z8k) zcfVar);
        this.d = new zcg((z8k) ba6Var);
        this.f = false;
        this.g = false;
        this.h = true;
        this.i = true;
    }

    public static int A(View view) {
        return view.getLeft() - ((tsf) view.getLayoutParams()).b.left;
    }

    public static int B(View view) {
        Rect rect = ((tsf) view.getLayoutParams()).b;
        return view.getMeasuredHeight() + rect.top + rect.bottom;
    }

    public static int C(View view) {
        Rect rect = ((tsf) view.getLayoutParams()).b;
        return view.getMeasuredWidth() + rect.left + rect.right;
    }

    public static int D(View view) {
        return view.getRight() + ((tsf) view.getLayoutParams()).b.right;
    }

    public static int E(View view) {
        return view.getTop() - ((tsf) view.getLayoutParams()).b.top;
    }

    public static int K(View view) {
        return ((tsf) view.getLayoutParams()).a.getLayoutPosition();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ssf, java.lang.Object] */
    public static ssf L(Context context, AttributeSet attributeSet, int i, int i2) {
        ?? obj = new Object();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, elf.a, i, i2);
        obj.a = obtainStyledAttributes.getInt(0, 1);
        obj.b = obtainStyledAttributes.getInt(10, 1);
        obj.c = obtainStyledAttributes.getBoolean(9, false);
        obj.d = obtainStyledAttributes.getBoolean(11, false);
        obtainStyledAttributes.recycle();
        return obj;
    }

    public static boolean Q(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (i3 > 0 && i != i3) {
            return false;
        }
        if (mode != Integer.MIN_VALUE) {
            if (mode == 0) {
                return true;
            }
            if (mode != 1073741824 || size != i) {
                return false;
            }
            return true;
        }
        if (size < i) {
            return false;
        }
        return true;
    }

    public static void R(View view, int i, int i2, int i3, int i4) {
        tsf tsfVar = (tsf) view.getLayoutParams();
        Rect rect = tsfVar.b;
        view.layout(i + rect.left + ((ViewGroup.MarginLayoutParams) tsfVar).leftMargin, i2 + rect.top + ((ViewGroup.MarginLayoutParams) tsfVar).topMargin, (i3 - rect.right) - ((ViewGroup.MarginLayoutParams) tsfVar).rightMargin, (i4 - rect.bottom) - ((ViewGroup.MarginLayoutParams) tsfVar).bottomMargin);
    }

    public static int g(int i, int i2, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 1073741824) {
                return Math.max(i2, i3);
            }
            return size;
        }
        return Math.min(size, Math.max(i2, i3));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0018, code lost:
    
        if (r6 == 1073741824) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int w(boolean z, int i, int i2, int i3, int i4) {
        int max = Math.max(0, i - i3);
        if (z) {
            if (i4 < 0) {
                if (i4 == -1) {
                    if (i2 != Integer.MIN_VALUE) {
                        if (i2 != 0) {
                        }
                    }
                    i4 = max;
                }
                i2 = 0;
                i4 = 0;
            }
            i2 = 1073741824;
        } else {
            if (i4 < 0) {
                if (i4 != -1) {
                    if (i4 == -2) {
                        if (i2 != Integer.MIN_VALUE && i2 != 1073741824) {
                            i4 = max;
                            i2 = 0;
                        } else {
                            i4 = max;
                            i2 = Integer.MIN_VALUE;
                        }
                    }
                    i2 = 0;
                    i4 = 0;
                }
                i4 = max;
            }
            i2 = 1073741824;
        }
        return View.MeasureSpec.makeMeasureSpec(i4, i2);
    }

    public static int y(View view) {
        return view.getBottom() + ((tsf) view.getLayoutParams()).b.bottom;
    }

    public final void A0(int i, int i2) {
        int v = v();
        if (v == 0) {
            this.b.q(i, i2);
            return;
        }
        int i3 = Integer.MIN_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 < v; i7++) {
            View u = u(i7);
            Rect rect = this.b.j;
            z(rect, u);
            int i8 = rect.left;
            if (i8 < i6) {
                i6 = i8;
            }
            int i9 = rect.right;
            if (i9 > i3) {
                i3 = i9;
            }
            int i10 = rect.top;
            if (i10 < i4) {
                i4 = i10;
            }
            int i11 = rect.bottom;
            if (i11 > i5) {
                i5 = i11;
            }
        }
        this.b.j.set(i6, i4, i3, i5);
        z0(this.b.j, i, i2);
    }

    public final void B0(RecyclerView recyclerView) {
        if (recyclerView == null) {
            this.b = null;
            this.a = null;
            this.n = 0;
            this.o = 0;
        } else {
            this.b = recyclerView;
            this.a = recyclerView.f;
            this.n = recyclerView.getWidth();
            this.o = recyclerView.getHeight();
        }
        this.l = 1073741824;
        this.m = 1073741824;
    }

    public final boolean C0(View view, int i, int i2, tsf tsfVar) {
        if (!view.isLayoutRequested() && this.h && Q(view.getWidth(), i, ((ViewGroup.MarginLayoutParams) tsfVar).width) && Q(view.getHeight(), i2, ((ViewGroup.MarginLayoutParams) tsfVar).height)) {
            return false;
        }
        return true;
    }

    public boolean D0() {
        return false;
    }

    public final boolean E0(View view, int i, int i2, tsf tsfVar) {
        if (this.h && Q(view.getMeasuredWidth(), i, ((ViewGroup.MarginLayoutParams) tsfVar).width) && Q(view.getMeasuredHeight(), i2, ((ViewGroup.MarginLayoutParams) tsfVar).height)) {
            return false;
        }
        return true;
    }

    public final int F() {
        c cVar;
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            cVar = recyclerView.getAdapter();
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar.getItemCount();
        }
        return 0;
    }

    public abstract void F0(RecyclerView recyclerView, int i);

    public final int G() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingBottom();
        }
        return 0;
    }

    public final void G0(z8b z8bVar) {
        z8b z8bVar2 = this.e;
        if (z8bVar2 != null && z8bVar != z8bVar2 && z8bVar2.e) {
            z8bVar2.i();
        }
        this.e = z8bVar;
        RecyclerView recyclerView = this.b;
        htf htfVar = recyclerView.r1;
        htfVar.g.removeCallbacks(htfVar);
        htfVar.c.abortAnimation();
        if (z8bVar.h) {
            m0.p("RecyclerView", "An instance of " + z8bVar.getClass().getSimpleName() + " was started more than once. Each instance of" + z8bVar.getClass().getSimpleName() + " is intended to only be used once. You should create a new instance for each use.");
        }
        z8bVar.b = recyclerView;
        z8bVar.c = this;
        int i = z8bVar.a;
        if (i != -1) {
            recyclerView.u1.a = i;
            z8bVar.e = true;
            z8bVar.d = true;
            z8bVar.f = recyclerView.n.q(i);
            z8bVar.b.r1.b();
            z8bVar.h = true;
            return;
        }
        dmk.v("Invalid target position");
    }

    public final int H() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingLeft();
        }
        return 0;
    }

    public boolean H0() {
        return false;
    }

    public final int I() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingRight();
        }
        return 0;
    }

    public final int J() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            return recyclerView.getPaddingTop();
        }
        return 0;
    }

    public int M(f fVar, etf etfVar) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.m != null && e()) {
            return this.b.m.getItemCount();
        }
        return 1;
    }

    public final void N(Rect rect, View view) {
        Matrix matrix;
        Rect rect2 = ((tsf) view.getLayoutParams()).b;
        rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
        if (this.b != null && (matrix = view.getMatrix()) != null && !matrix.isIdentity()) {
            RectF rectF = this.b.l;
            rectF.set(rect);
            matrix.mapRect(rectF);
            rect.set((int) Math.floor(rectF.left), (int) Math.floor(rectF.top), (int) Math.ceil(rectF.right), (int) Math.ceil(rectF.bottom));
        }
        rect.offset(view.getLeft(), view.getTop());
    }

    public abstract boolean O();

    public boolean P() {
        return false;
    }

    public void S(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int o = recyclerView.f.o();
            for (int i2 = 0; i2 < o; i2++) {
                recyclerView.f.m(i2).offsetLeftAndRight(i);
            }
        }
    }

    public void T(int i) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            int o = recyclerView.f.o();
            for (int i2 = 0; i2 < o; i2++) {
                recyclerView.f.m(i2).offsetTopAndBottom(i);
            }
        }
    }

    public abstract void W(RecyclerView recyclerView);

    public abstract View X(View view, int i, f fVar, etf etfVar);

    public void Y(AccessibilityEvent accessibilityEvent) {
        RecyclerView recyclerView = this.b;
        f fVar = recyclerView.c;
        if (accessibilityEvent != null) {
            boolean z = true;
            if (!recyclerView.canScrollVertically(1) && !this.b.canScrollVertically(-1) && !this.b.canScrollHorizontally(-1) && !this.b.canScrollHorizontally(1)) {
                z = false;
            }
            accessibilityEvent.setScrollable(z);
            c cVar = this.b.m;
            if (cVar != null) {
                accessibilityEvent.setItemCount(cVar.getItemCount());
            }
        }
    }

    public void Z(f fVar, etf etfVar, d7 d7Var) {
        if (this.b.canScrollVertically(-1) || this.b.canScrollHorizontally(-1)) {
            d7Var.a(8192);
            d7Var.m(true);
            Bundle extras = d7Var.a.getExtras();
            if (extras != null) {
                extras.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
            }
        }
        if (this.b.canScrollVertically(1) || this.b.canScrollHorizontally(1)) {
            d7Var.a(4096);
            d7Var.m(true);
            Bundle extras2 = d7Var.a.getExtras();
            if (extras2 != null) {
                extras2.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", (extras2.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (-67108865)) | 67108864);
            }
        }
        d7Var.k(b7.a(M(fVar, etfVar), x(fVar, etfVar), 0));
    }

    public final void a0(View view, d7 d7Var) {
        g O = RecyclerView.O(view);
        if (O != null && !O.isRemoved()) {
            x8j x8jVar = this.a;
            if (!((ArrayList) x8jVar.e).contains(O.itemView)) {
                RecyclerView recyclerView = this.b;
                b0(recyclerView.c, recyclerView.u1, view, d7Var);
            }
        }
    }

    public final void b(View view, int i, boolean z) {
        int i2;
        g O = RecyclerView.O(view);
        if (!z && !O.isRemoved()) {
            this.b.g.g0(O);
        } else {
            b7h b7hVar = (b7h) this.b.g.b;
            z9k z9kVar = (z9k) b7hVar.get(O);
            if (z9kVar == null) {
                z9kVar = z9k.a();
                b7hVar.put(O, z9kVar);
            }
            z9kVar.a |= 1;
        }
        tsf tsfVar = (tsf) view.getLayoutParams();
        if (!O.wasReturnedFromScrap() && !O.isScrap()) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.b;
            x8j x8jVar = this.a;
            int i3 = -1;
            if (parent == recyclerView) {
                v14 v14Var = (v14) x8jVar.d;
                int indexOfChild = ((RecyclerView) ((rn6) x8jVar.c).a).indexOfChild(view);
                if (indexOfChild == -1 || v14Var.t(indexOfChild)) {
                    i2 = -1;
                } else {
                    i2 = indexOfChild - v14Var.q(indexOfChild);
                }
                if (i == -1) {
                    i = this.a.o();
                }
                if (i2 != -1) {
                    if (i2 != i) {
                        e eVar = this.b.n;
                        View u = eVar.u(i2);
                        if (u != null) {
                            eVar.u(i2);
                            eVar.a.g(i2);
                            tsf tsfVar2 = (tsf) u.getLayoutParams();
                            g O2 = RecyclerView.O(u);
                            boolean isRemoved = O2.isRemoved();
                            RecyclerView recyclerView2 = eVar.b;
                            if (isRemoved) {
                                b7h b7hVar2 = (b7h) recyclerView2.g.b;
                                z9k z9kVar2 = (z9k) b7hVar2.get(O2);
                                if (z9kVar2 == null) {
                                    z9kVar2 = z9k.a();
                                    b7hVar2.put(O2, z9kVar2);
                                }
                                z9kVar2.a = 1 | z9kVar2.a;
                            } else {
                                recyclerView2.g.g0(O2);
                            }
                            eVar.a.f(u, i, tsfVar2, O2.isRemoved());
                        } else {
                            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i2 + eVar.b.toString());
                        }
                    }
                } else {
                    throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.b.indexOfChild(view) + this.b.C());
                }
            } else {
                x8jVar.e(view, i, false);
                tsfVar.c = true;
                z8b z8bVar = this.e;
                if (z8bVar != null && z8bVar.e) {
                    z8bVar.b.getClass();
                    g O3 = RecyclerView.O(view);
                    if (O3 != null) {
                        i3 = O3.getLayoutPosition();
                    }
                    if (i3 == z8bVar.a) {
                        z8bVar.f = view;
                    }
                }
            }
        } else {
            if (O.isScrap()) {
                O.unScrap();
            } else {
                O.clearReturnedFromScrapFlag();
            }
            this.a.f(view, i, view.getLayoutParams(), false);
        }
        if (tsfVar.d) {
            if (RecyclerView.Q1) {
                Objects.toString(tsfVar.a);
            }
            O.itemView.invalidate();
            tsfVar.d = false;
        }
    }

    public void b0(f fVar, etf etfVar, View view, d7 d7Var) {
        int i;
        int i2;
        if (e()) {
            i = K(view);
        } else {
            i = 0;
        }
        if (d()) {
            i2 = K(view);
        } else {
            i2 = 0;
        }
        d7Var.l(c7.a(false, i, 1, i2, 1));
    }

    public void c(String str) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.k(str);
        }
    }

    public abstract boolean d();

    public abstract boolean e();

    public boolean f(tsf tsfVar) {
        return true;
    }

    public abstract void h0(f fVar, etf etfVar);

    public abstract void i0(etf etfVar);

    public abstract int j(etf etfVar);

    public abstract int k(etf etfVar);

    public Parcelable k0() {
        return null;
    }

    public abstract int l(etf etfVar);

    public abstract int m(etf etfVar);

    public boolean m0(int i, Bundle bundle) {
        RecyclerView recyclerView = this.b;
        return n0(recyclerView.c, recyclerView.u1, i, bundle);
    }

    public abstract int n(etf etfVar);

    /* JADX WARN: Removed duplicated region for block: B:13:0x008c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00bc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean n0(f fVar, etf etfVar, int i, Bundle bundle) {
        int i2;
        int H;
        float f;
        if (this.b != null) {
            int i3 = this.o;
            int i4 = this.n;
            Rect rect = new Rect();
            if (this.b.getMatrix().isIdentity() && this.b.getGlobalVisibleRect(rect)) {
                i3 = rect.height();
                i4 = rect.width();
            }
            if (i != 4096) {
                if (i != 8192) {
                    i2 = 0;
                    H = 0;
                } else {
                    if (this.b.canScrollVertically(-1)) {
                        i2 = -((i3 - J()) - G());
                    } else {
                        i2 = 0;
                    }
                    if (this.b.canScrollHorizontally(-1)) {
                        H = -((i4 - H()) - I());
                    }
                    H = 0;
                }
                if (i2 == 0 || H != 0) {
                    if (bundle != null) {
                        f = bundle.getFloat("androidx.core.view.accessibility.action.ARGUMENT_SCROLL_AMOUNT_FLOAT", 1.0f);
                        if (f < 0.0f) {
                            if (RecyclerView.P1) {
                                throw new IllegalArgumentException("attempting to use ACTION_ARGUMENT_SCROLL_AMOUNT_FLOAT with a negative value (" + f + ")");
                            }
                        }
                    } else {
                        f = 1.0f;
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                        RecyclerView recyclerView = this.b;
                        c cVar = recyclerView.m;
                        if (cVar != null) {
                            if (i != 4096) {
                                if (i != 8192) {
                                    return true;
                                }
                                recyclerView.n0(0);
                                return true;
                            }
                            recyclerView.n0(cVar.getItemCount() - 1);
                            return true;
                        }
                    } else {
                        if (Float.compare(1.0f, f) != 0 && Float.compare(0.0f, f) != 0) {
                            H = (int) (H * f);
                            i2 = (int) (i2 * f);
                        }
                        this.b.m0(H, i2, true);
                        return true;
                    }
                }
            } else {
                if (this.b.canScrollVertically(1)) {
                    i2 = (i3 - J()) - G();
                } else {
                    i2 = 0;
                }
                if (this.b.canScrollHorizontally(1)) {
                    H = (i4 - H()) - I();
                    if (i2 == 0) {
                    }
                    if (bundle != null) {
                    }
                    if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                    }
                }
                H = 0;
                if (i2 == 0) {
                }
                if (bundle != null) {
                }
                if (Float.compare(f, Float.POSITIVE_INFINITY) == 0) {
                }
            }
        }
        return false;
    }

    public abstract int o(etf etfVar);

    public final void o0(f fVar) {
        for (int v = v() - 1; v >= 0; v--) {
            if (!RecyclerView.O(u(v)).shouldIgnore()) {
                View u = u(v);
                r0(v);
                fVar.i(u);
            }
        }
    }

    public final void p(f fVar) {
        for (int v = v() - 1; v >= 0; v--) {
            View u = u(v);
            g O = RecyclerView.O(u);
            if (O.shouldIgnore()) {
                if (RecyclerView.Q1) {
                    O.toString();
                }
            } else if (O.isInvalid() && !O.isRemoved() && !this.b.m.hasStableIds()) {
                r0(v);
                fVar.j(O);
            } else {
                u(v);
                this.a.g(v);
                fVar.k(u);
                this.b.g.g0(O);
            }
        }
    }

    public final void p0(f fVar) {
        ArrayList arrayList;
        int size = fVar.a.size();
        int i = size - 1;
        while (true) {
            arrayList = fVar.a;
            if (i < 0) {
                break;
            }
            View view = ((g) arrayList.get(i)).itemView;
            g O = RecyclerView.O(view);
            if (!O.shouldIgnore()) {
                O.setIsRecyclable(false);
                if (O.isTmpDetached()) {
                    this.b.removeDetachedView(view, false);
                }
                d dVar = this.b.M;
                if (dVar != null) {
                    dVar.endAnimation(O);
                }
                O.setIsRecyclable(true);
                g O2 = RecyclerView.O(view);
                O2.mScrapContainer = null;
                O2.mInChangeScrap = false;
                O2.clearReturnedFromScrapFlag();
                fVar.j(O2);
            }
            i--;
        }
        arrayList.clear();
        ArrayList arrayList2 = fVar.b;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        if (size > 0) {
            this.b.invalidate();
        }
    }

    public View q(int i) {
        int v = v();
        for (int i2 = 0; i2 < v; i2++) {
            View u = u(i2);
            g O = RecyclerView.O(u);
            if (O != null && O.getLayoutPosition() == i && !O.shouldIgnore() && (this.b.u1.g || !O.isRemoved())) {
                return u;
            }
        }
        return null;
    }

    public final void q0(View view, f fVar) {
        x8j x8jVar = this.a;
        rn6 rn6Var = (rn6) x8jVar.c;
        int i = x8jVar.b;
        if (i != 1) {
            if (i != 2) {
                try {
                    x8jVar.b = 1;
                    x8jVar.f = view;
                    int indexOfChild = ((RecyclerView) rn6Var.a).indexOfChild(view);
                    if (indexOfChild >= 0) {
                        if (((v14) x8jVar.d).x(indexOfChild)) {
                            x8jVar.z(view);
                        }
                        rn6Var.E(indexOfChild);
                    }
                    x8jVar.b = 0;
                    x8jVar.f = null;
                    fVar.i(view);
                    return;
                } catch (Throwable th) {
                    x8jVar.b = 0;
                    x8jVar.f = null;
                    throw th;
                }
            }
            dmk.n("Cannot call removeView(At) within removeViewIfHidden");
            return;
        }
        dmk.n("Cannot call removeView(At) within removeView(At)");
    }

    public abstract tsf r();

    public final void r0(int i) {
        if (u(i) != null) {
            x8j x8jVar = this.a;
            rn6 rn6Var = (rn6) x8jVar.c;
            int i2 = x8jVar.b;
            if (i2 != 1) {
                if (i2 != 2) {
                    try {
                        int p = x8jVar.p(i);
                        View childAt = ((RecyclerView) rn6Var.a).getChildAt(p);
                        if (childAt == null) {
                            x8jVar.b = 0;
                            x8jVar.f = null;
                            return;
                        }
                        x8jVar.b = 1;
                        x8jVar.f = childAt;
                        if (((v14) x8jVar.d).x(p)) {
                            x8jVar.z(childAt);
                        }
                        rn6Var.E(p);
                        x8jVar.b = 0;
                        x8jVar.f = null;
                        return;
                    } catch (Throwable th) {
                        x8jVar.b = 0;
                        x8jVar.f = null;
                        throw th;
                    }
                }
                dmk.n("Cannot call removeView(At) within removeViewIfHidden");
                return;
            }
            dmk.n("Cannot call removeView(At) within removeView(At)");
        }
    }

    public tsf s(Context context, AttributeSet attributeSet) {
        return new tsf(context, attributeSet);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00ad, code lost:
    
        if ((r5.bottom - r10) > r2) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean s0(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
        int H = H();
        int J = J();
        int I = this.n - I();
        int G = this.o - G();
        int left = (view.getLeft() + rect.left) - view.getScrollX();
        int top = (view.getTop() + rect.top) - view.getScrollY();
        int width = rect.width() + left;
        int height = rect.height() + top;
        int i = left - H;
        int min = Math.min(0, i);
        int i2 = top - J;
        int min2 = Math.min(0, i2);
        int i3 = width - I;
        int max = Math.max(0, i3);
        int max2 = Math.max(0, height - G);
        if (this.b.getLayoutDirection() == 1) {
            if (max == 0) {
                max = Math.max(min, i3);
            }
        } else {
            if (min == 0) {
                min = Math.min(i, max);
            }
            max = min;
        }
        if (min2 == 0) {
            min2 = Math.min(i2, max2);
        }
        int[] iArr = {max, min2};
        int i4 = iArr[0];
        int i5 = iArr[1];
        if (z2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild != null) {
                int H2 = H();
                int J2 = J();
                int I2 = this.n - I();
                int G2 = this.o - G();
                Rect rect2 = this.b.j;
                z(rect2, focusedChild);
                if (rect2.left - i4 < I2) {
                    if (rect2.right - i4 > H2) {
                        if (rect2.top - i5 < G2) {
                        }
                    }
                }
            }
            return false;
        }
        if (i4 != 0 || i5 != 0) {
            if (z) {
                recyclerView.scrollBy(i4, i5);
                return true;
            }
            recyclerView.m0(i4, i5, false);
            return true;
        }
        return false;
    }

    public tsf t(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof tsf) {
            return new tsf((tsf) layoutParams);
        }
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new tsf((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new tsf(layoutParams);
    }

    public final void t0() {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.requestLayout();
        }
    }

    public final View u(int i) {
        x8j x8jVar = this.a;
        if (x8jVar != null) {
            return x8jVar.m(i);
        }
        return null;
    }

    public abstract int u0(int i, etf etfVar, f fVar);

    public final int v() {
        x8j x8jVar = this.a;
        if (x8jVar != null) {
            return x8jVar.o();
        }
        return 0;
    }

    public abstract void v0(int i);

    public abstract int w0(int i, etf etfVar, f fVar);

    public int x(f fVar, etf etfVar) {
        RecyclerView recyclerView = this.b;
        if (recyclerView != null && recyclerView.m != null && d()) {
            return this.b.m.getItemCount();
        }
        return 1;
    }

    public final void x0(RecyclerView recyclerView) {
        y0(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
    }

    public final void y0(int i, int i2) {
        this.n = View.MeasureSpec.getSize(i);
        int mode = View.MeasureSpec.getMode(i);
        this.l = mode;
        if (mode == 0 && !RecyclerView.T1) {
            this.n = 0;
        }
        this.o = View.MeasureSpec.getSize(i2);
        int mode2 = View.MeasureSpec.getMode(i2);
        this.m = mode2;
        if (mode2 == 0 && !RecyclerView.T1) {
            this.o = 0;
        }
    }

    public void z(Rect rect, View view) {
        RecyclerView.P(rect, view);
    }

    public void z0(Rect rect, int i, int i2) {
        int I = I() + H() + rect.width();
        int G = G() + J() + rect.height();
        RecyclerView recyclerView = this.b;
        WeakHashMap weakHashMap = k9k.a;
        RecyclerView.g(this.b, g(i, I, recyclerView.getMinimumWidth()), g(i2, G, this.b.getMinimumHeight()));
    }

    public void U() {
    }

    public void d0() {
    }

    public void V(RecyclerView recyclerView) {
    }

    public void j0(Parcelable parcelable) {
    }

    public void l0(int i) {
    }

    public void c0(int i, int i2) {
    }

    public void e0(int i, int i2) {
    }

    public void f0(int i, int i2) {
    }

    public void g0(int i, int i2) {
    }

    public void i(int i, gg1 gg1Var) {
    }

    public void h(int i, int i2, etf etfVar, gg1 gg1Var) {
    }
}
