package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.polymarket.android.R;
import java.lang.ref.WeakReference;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class hm {
    public NestedScrollView A;
    public Drawable C;
    public ImageView D;
    public TextView E;
    public TextView F;
    public View G;
    public ListAdapter H;
    public final int J;
    public final int K;
    public final int L;
    public final int M;
    public final int N;
    public final boolean O;
    public final dxk P;
    public final Context a;
    public final jm b;
    public final Window c;
    public final int d;
    public CharSequence e;
    public CharSequence f;
    public AlertController$RecycleListView g;
    public View h;
    public int i;
    public int j;
    public int k;
    public int l;
    public int m;
    public Button o;
    public CharSequence p;
    public Message q;
    public Drawable r;
    public Button s;
    public CharSequence t;
    public Message u;
    public Drawable v;
    public Button w;
    public CharSequence x;
    public Message y;
    public Drawable z;
    public boolean n = false;
    public int B = 0;
    public int I = -1;
    public final k8 Q = new k8(this, 1);

    public hm(Context context, jm jmVar, Window window) {
        this.a = context;
        this.b = jmVar;
        this.c = window;
        dxk dxkVar = new dxk();
        dxkVar.b = new WeakReference(jmVar);
        this.P = dxkVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, ulf.e, R.attr.alertDialogStyle, 0);
        this.J = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.K = obtainStyledAttributes.getResourceId(4, 0);
        this.L = obtainStyledAttributes.getResourceId(5, 0);
        this.M = obtainStyledAttributes.getResourceId(7, 0);
        this.N = obtainStyledAttributes.getResourceId(3, 0);
        this.O = obtainStyledAttributes.getBoolean(6, true);
        this.d = obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        jmVar.d().j(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }

    public final void c(int i, CharSequence charSequence, DialogInterface.OnClickListener onClickListener, Drawable drawable) {
        Message message;
        if (onClickListener != null) {
            message = this.P.obtainMessage(i, onClickListener);
        } else {
            message = null;
        }
        if (i != -3) {
            if (i != -2) {
                if (i == -1) {
                    this.p = charSequence;
                    this.q = message;
                    this.r = drawable;
                    return;
                }
                dmk.v("Button does not exist");
                return;
            }
            this.t = charSequence;
            this.u = message;
            this.v = drawable;
            return;
        }
        this.x = charSequence;
        this.y = message;
        this.z = drawable;
    }
}
