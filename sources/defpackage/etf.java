package defpackage;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class etf {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public int l;
    public long m;
    public int n;

    public final void a(int i) {
        if ((this.d & i) != 0) {
            return;
        }
        omf.l("Layout state should be one of ", Integer.toBinaryString(i), " but it is ", Integer.toBinaryString(this.d));
    }

    public final int b() {
        if (this.g) {
            return this.b - this.c;
        }
        return this.e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("State{mTargetPosition=");
        sb.append(this.a);
        sb.append(", mData=null, mItemCount=");
        sb.append(this.e);
        sb.append(", mIsMeasuring=");
        sb.append(this.i);
        sb.append(", mPreviousLayoutItemCount=");
        sb.append(this.b);
        sb.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
        sb.append(this.c);
        sb.append(", mStructureChanged=");
        sb.append(this.f);
        sb.append(", mInPreLayout=");
        sb.append(this.g);
        sb.append(", mRunSimpleAnimations=");
        sb.append(this.j);
        sb.append(", mRunPredictiveAnimations=");
        return hdi.t(sb, this.k, '}');
    }
}
