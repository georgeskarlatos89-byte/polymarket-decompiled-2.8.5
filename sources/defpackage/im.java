package defpackage;

import android.R;
import android.content.Context;
import android.content.DialogInterface;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class im {
    private final fm P;
    private final int mTheme;

    public im(Context context, int i) {
        this.P = new fm(new ContextThemeWrapper(context, jm.g(context, i)));
        this.mTheme = i;
    }

    public jm create() {
        AlertController$RecycleListView alertController$RecycleListView;
        int i;
        ListAdapter listAdapter;
        jm jmVar = new jm(this.P.a, this.mTheme);
        fm fmVar = this.P;
        View view = fmVar.f;
        ContextThemeWrapper contextThemeWrapper = fmVar.a;
        hm hmVar = jmVar.g;
        if (view != null) {
            hmVar.G = view;
        } else {
            CharSequence charSequence = fmVar.e;
            if (charSequence != null) {
                hmVar.e = charSequence;
                TextView textView = hmVar.E;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = fmVar.d;
            if (drawable != null) {
                hmVar.C = drawable;
                hmVar.B = 0;
                ImageView imageView = hmVar.D;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    hmVar.D.setImageDrawable(drawable);
                }
            }
            int i2 = fmVar.c;
            if (i2 != 0) {
                hmVar.C = null;
                hmVar.B = i2;
                ImageView imageView2 = hmVar.D;
                if (imageView2 != null) {
                    if (i2 != 0) {
                        imageView2.setVisibility(0);
                        hmVar.D.setImageResource(hmVar.B);
                    } else {
                        imageView2.setVisibility(8);
                    }
                }
            }
        }
        CharSequence charSequence2 = fmVar.g;
        if (charSequence2 != null) {
            hmVar.f = charSequence2;
            TextView textView2 = hmVar.F;
            if (textView2 != null) {
                textView2.setText(charSequence2);
            }
        }
        CharSequence charSequence3 = fmVar.h;
        if (charSequence3 != null || fmVar.i != null) {
            hmVar.c(-1, charSequence3, fmVar.j, fmVar.i);
        }
        CharSequence charSequence4 = fmVar.k;
        if (charSequence4 != null || fmVar.l != null) {
            hmVar.c(-2, charSequence4, fmVar.m, fmVar.l);
        }
        CharSequence charSequence5 = fmVar.n;
        if (charSequence5 != null || fmVar.o != null) {
            hmVar.c(-3, charSequence5, fmVar.p, fmVar.o);
        }
        if (fmVar.u != null || fmVar.J != null || fmVar.v != null) {
            AlertController$RecycleListView alertController$RecycleListView2 = (AlertController$RecycleListView) fmVar.b.inflate(hmVar.K, (ViewGroup) null);
            if (fmVar.F) {
                if (fmVar.J == null) {
                    listAdapter = new bm(fmVar, contextThemeWrapper, hmVar.L, fmVar.u, alertController$RecycleListView2);
                    alertController$RecycleListView = alertController$RecycleListView2;
                } else {
                    listAdapter = new cm(fmVar, contextThemeWrapper, fmVar.J, alertController$RecycleListView2, hmVar);
                    alertController$RecycleListView = alertController$RecycleListView2;
                }
            } else {
                alertController$RecycleListView = alertController$RecycleListView2;
                if (fmVar.G) {
                    i = hmVar.M;
                } else {
                    i = hmVar.N;
                }
                int i3 = i;
                if (fmVar.J != null) {
                    listAdapter = new SimpleCursorAdapter(contextThemeWrapper, i3, fmVar.J, new String[]{fmVar.K}, new int[]{R.id.text1});
                } else {
                    ListAdapter listAdapter2 = fmVar.v;
                    if (listAdapter2 == null) {
                        listAdapter2 = new ArrayAdapter(contextThemeWrapper, i3, R.id.text1, fmVar.u);
                    }
                    listAdapter = listAdapter2;
                }
            }
            hmVar.H = listAdapter;
            hmVar.I = fmVar.H;
            if (fmVar.w != null) {
                alertController$RecycleListView.setOnItemClickListener(new dm(fmVar, hmVar));
            } else if (fmVar.I != null) {
                alertController$RecycleListView.setOnItemClickListener(new em(fmVar, alertController$RecycleListView, hmVar));
            }
            AdapterView.OnItemSelectedListener onItemSelectedListener = fmVar.M;
            if (onItemSelectedListener != null) {
                alertController$RecycleListView.setOnItemSelectedListener(onItemSelectedListener);
            }
            if (fmVar.G) {
                alertController$RecycleListView.setChoiceMode(1);
            } else if (fmVar.F) {
                alertController$RecycleListView.setChoiceMode(2);
            }
            hmVar.g = alertController$RecycleListView;
        }
        View view2 = fmVar.y;
        if (view2 != null) {
            if (fmVar.D) {
                int i4 = fmVar.z;
                int i5 = fmVar.A;
                int i6 = fmVar.B;
                int i7 = fmVar.C;
                hmVar.h = view2;
                hmVar.i = 0;
                hmVar.n = true;
                hmVar.j = i4;
                hmVar.k = i5;
                hmVar.l = i6;
                hmVar.m = i7;
            } else {
                hmVar.h = view2;
                hmVar.i = 0;
                hmVar.n = false;
            }
        } else {
            int i8 = fmVar.x;
            if (i8 != 0) {
                hmVar.h = null;
                hmVar.i = i8;
                hmVar.n = false;
            }
        }
        jmVar.setCancelable(this.P.q);
        if (this.P.q) {
            jmVar.setCanceledOnTouchOutside(true);
        }
        jmVar.setOnCancelListener(this.P.r);
        jmVar.setOnDismissListener(this.P.s);
        DialogInterface.OnKeyListener onKeyListener = this.P.t;
        if (onKeyListener != null) {
            jmVar.setOnKeyListener(onKeyListener);
        }
        return jmVar;
    }

    public Context getContext() {
        return this.P.a;
    }

    public im setAdapter(ListAdapter listAdapter, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.v = listAdapter;
        fmVar.w = onClickListener;
        return this;
    }

    public im setCancelable(boolean z) {
        this.P.q = z;
        return this;
    }

    public im setCursor(Cursor cursor, DialogInterface.OnClickListener onClickListener, String str) {
        fm fmVar = this.P;
        fmVar.J = cursor;
        fmVar.K = str;
        fmVar.w = onClickListener;
        return this;
    }

    public im setCustomTitle(View view) {
        this.P.f = view;
        return this;
    }

    public im setIcon(int i) {
        this.P.c = i;
        return this;
    }

    public im setIconAttribute(int i) {
        TypedValue typedValue = new TypedValue();
        this.P.a.getTheme().resolveAttribute(i, typedValue, true);
        this.P.c = typedValue.resourceId;
        return this;
    }

    @Deprecated
    public im setInverseBackgroundForced(boolean z) {
        this.P.getClass();
        return this;
    }

    public im setItems(int i, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.u = fmVar.a.getResources().getTextArray(i);
        this.P.w = onClickListener;
        return this;
    }

    public im setMessage(int i) {
        fm fmVar = this.P;
        fmVar.g = fmVar.a.getText(i);
        return this;
    }

    public im setMultiChoiceItems(int i, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        fm fmVar = this.P;
        fmVar.u = fmVar.a.getResources().getTextArray(i);
        fm fmVar2 = this.P;
        fmVar2.I = onMultiChoiceClickListener;
        fmVar2.E = zArr;
        fmVar2.F = true;
        return this;
    }

    public im setNegativeButton(int i, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.k = fmVar.a.getText(i);
        this.P.m = onClickListener;
        return this;
    }

    public im setNegativeButtonIcon(Drawable drawable) {
        this.P.l = drawable;
        return this;
    }

    public im setNeutralButton(int i, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.n = fmVar.a.getText(i);
        this.P.p = onClickListener;
        return this;
    }

    public im setNeutralButtonIcon(Drawable drawable) {
        this.P.o = drawable;
        return this;
    }

    public im setOnCancelListener(DialogInterface.OnCancelListener onCancelListener) {
        this.P.r = onCancelListener;
        return this;
    }

    public im setOnDismissListener(DialogInterface.OnDismissListener onDismissListener) {
        this.P.s = onDismissListener;
        return this;
    }

    public im setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.P.M = onItemSelectedListener;
        return this;
    }

    public im setOnKeyListener(DialogInterface.OnKeyListener onKeyListener) {
        this.P.t = onKeyListener;
        return this;
    }

    public im setPositiveButton(int i, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.h = fmVar.a.getText(i);
        this.P.j = onClickListener;
        return this;
    }

    public im setPositiveButtonIcon(Drawable drawable) {
        this.P.i = drawable;
        return this;
    }

    public im setRecycleOnMeasureEnabled(boolean z) {
        this.P.getClass();
        return this;
    }

    public im setSingleChoiceItems(int i, int i2, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.u = fmVar.a.getResources().getTextArray(i);
        fm fmVar2 = this.P;
        fmVar2.w = onClickListener;
        fmVar2.H = i2;
        fmVar2.G = true;
        return this;
    }

    public im setTitle(int i) {
        fm fmVar = this.P;
        fmVar.e = fmVar.a.getText(i);
        return this;
    }

    @Deprecated
    public im setView(View view, int i, int i2, int i3, int i4) {
        fm fmVar = this.P;
        fmVar.y = view;
        fmVar.x = 0;
        fmVar.D = true;
        fmVar.z = i;
        fmVar.A = i2;
        fmVar.B = i3;
        fmVar.C = i4;
        return this;
    }

    public jm show() {
        jm create = create();
        create.show();
        return create;
    }

    public im setIcon(Drawable drawable) {
        this.P.d = drawable;
        return this;
    }

    public im setMessage(CharSequence charSequence) {
        this.P.g = charSequence;
        return this;
    }

    public im setTitle(CharSequence charSequence) {
        this.P.e = charSequence;
        return this;
    }

    public im setNegativeButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.k = charSequence;
        fmVar.m = onClickListener;
        return this;
    }

    public im setNeutralButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.n = charSequence;
        fmVar.p = onClickListener;
        return this;
    }

    public im setPositiveButton(CharSequence charSequence, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.h = charSequence;
        fmVar.j = onClickListener;
        return this;
    }

    public im setItems(CharSequence[] charSequenceArr, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.u = charSequenceArr;
        fmVar.w = onClickListener;
        return this;
    }

    public im setView(View view) {
        fm fmVar = this.P;
        fmVar.y = view;
        fmVar.x = 0;
        fmVar.D = false;
        return this;
    }

    public im(Context context) {
        this(context, jm.g(context, 0));
    }

    public im setView(int i) {
        fm fmVar = this.P;
        fmVar.y = null;
        fmVar.x = i;
        fmVar.D = false;
        return this;
    }

    public im setMultiChoiceItems(CharSequence[] charSequenceArr, boolean[] zArr, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        fm fmVar = this.P;
        fmVar.u = charSequenceArr;
        fmVar.I = onMultiChoiceClickListener;
        fmVar.E = zArr;
        fmVar.F = true;
        return this;
    }

    public im setSingleChoiceItems(Cursor cursor, int i, String str, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.J = cursor;
        fmVar.w = onClickListener;
        fmVar.H = i;
        fmVar.K = str;
        fmVar.G = true;
        return this;
    }

    public im setMultiChoiceItems(Cursor cursor, String str, String str2, DialogInterface.OnMultiChoiceClickListener onMultiChoiceClickListener) {
        fm fmVar = this.P;
        fmVar.J = cursor;
        fmVar.I = onMultiChoiceClickListener;
        fmVar.L = str;
        fmVar.K = str2;
        fmVar.F = true;
        return this;
    }

    public im setSingleChoiceItems(CharSequence[] charSequenceArr, int i, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.u = charSequenceArr;
        fmVar.w = onClickListener;
        fmVar.H = i;
        fmVar.G = true;
        return this;
    }

    public im setSingleChoiceItems(ListAdapter listAdapter, int i, DialogInterface.OnClickListener onClickListener) {
        fm fmVar = this.P;
        fmVar.v = listAdapter;
        fmVar.w = onClickListener;
        fmVar.H = i;
        fmVar.G = true;
        return this;
    }
}
