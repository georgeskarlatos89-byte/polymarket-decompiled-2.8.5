package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import com.polymarket.android.R;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class jm extends cg0 implements DialogInterface {
    public final hm g;

    public jm(ContextThemeWrapper contextThemeWrapper, int i) {
        super(contextThemeWrapper, g(contextThemeWrapper, i));
        this.g = new hm(getContext(), this, getWindow());
    }

    public static int g(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final Button f(int i) {
        hm hmVar = this.g;
        if (i != -3) {
            if (i != -2) {
                if (i != -1) {
                    hmVar.getClass();
                    return null;
                }
                return hmVar.o;
            }
            return hmVar.s;
        }
        return hmVar.w;
    }

    @Override // defpackage.cg0, defpackage.wk4, android.app.Dialog
    public final void onCreate(Bundle bundle) {
        boolean z;
        int i;
        View view;
        boolean z2;
        int i2;
        boolean z3;
        int i3;
        ListAdapter listAdapter;
        int i4;
        int i5;
        int i6;
        View findViewById;
        View findViewById2;
        super.onCreate(bundle);
        hm hmVar = this.g;
        hmVar.b.setContentView(hmVar.J);
        Context context = hmVar.a;
        Window window = hmVar.c;
        View findViewById3 = window.findViewById(R.id.parentPanel);
        View findViewById4 = findViewById3.findViewById(R.id.topPanel);
        View findViewById5 = findViewById3.findViewById(R.id.contentPanel);
        View findViewById6 = findViewById3.findViewById(R.id.buttonPanel);
        ViewGroup viewGroup = (ViewGroup) findViewById3.findViewById(R.id.customPanel);
        View view2 = hmVar.h;
        if (view2 == null) {
            if (hmVar.i != 0) {
                view2 = LayoutInflater.from(context).inflate(hmVar.i, viewGroup, false);
            } else {
                view2 = null;
            }
        }
        if (view2 != null) {
            z = true;
        } else {
            z = false;
        }
        if (!z || !hm.a(view2)) {
            window.setFlags(131072, 131072);
        }
        if (z) {
            FrameLayout frameLayout = (FrameLayout) window.findViewById(R.id.custom);
            frameLayout.addView(view2, new ViewGroup.LayoutParams(-1, -1));
            if (hmVar.n) {
                frameLayout.setPadding(hmVar.j, hmVar.k, hmVar.l, hmVar.m);
            }
            if (hmVar.g != null) {
                ((LinearLayout.LayoutParams) ((t8b) viewGroup.getLayoutParams())).weight = 0.0f;
            }
        } else {
            viewGroup.setVisibility(8);
        }
        View findViewById7 = viewGroup.findViewById(R.id.topPanel);
        View findViewById8 = viewGroup.findViewById(R.id.contentPanel);
        View findViewById9 = viewGroup.findViewById(R.id.buttonPanel);
        ViewGroup b = hm.b(findViewById7, findViewById4);
        ViewGroup b2 = hm.b(findViewById8, findViewById5);
        ViewGroup b3 = hm.b(findViewById9, findViewById6);
        NestedScrollView nestedScrollView = (NestedScrollView) window.findViewById(R.id.scrollView);
        hmVar.A = nestedScrollView;
        nestedScrollView.setFocusable(false);
        hmVar.A.setNestedScrollingEnabled(false);
        TextView textView = (TextView) b2.findViewById(android.R.id.message);
        hmVar.F = textView;
        if (textView != null) {
            CharSequence charSequence = hmVar.f;
            if (charSequence != null) {
                textView.setText(charSequence);
            } else {
                textView.setVisibility(8);
                hmVar.A.removeView(hmVar.F);
                if (hmVar.g != null) {
                    ViewGroup viewGroup2 = (ViewGroup) hmVar.A.getParent();
                    int indexOfChild = viewGroup2.indexOfChild(hmVar.A);
                    viewGroup2.removeViewAt(indexOfChild);
                    viewGroup2.addView(hmVar.g, indexOfChild, new ViewGroup.LayoutParams(-1, -1));
                } else {
                    b2.setVisibility(8);
                }
            }
        }
        int i7 = hmVar.d;
        Button button = (Button) b3.findViewById(android.R.id.button1);
        hmVar.o = button;
        k8 k8Var = hmVar.Q;
        button.setOnClickListener(k8Var);
        if (TextUtils.isEmpty(hmVar.p) && hmVar.r == null) {
            hmVar.o.setVisibility(8);
            i = 0;
        } else {
            hmVar.o.setText(hmVar.p);
            Drawable drawable = hmVar.r;
            if (drawable != null) {
                drawable.setBounds(0, 0, i7, i7);
                hmVar.o.setCompoundDrawables(hmVar.r, null, null, null);
            }
            hmVar.o.setVisibility(0);
            i = 1;
        }
        Button button2 = (Button) b3.findViewById(android.R.id.button2);
        hmVar.s = button2;
        button2.setOnClickListener(k8Var);
        if (TextUtils.isEmpty(hmVar.t) && hmVar.v == null) {
            hmVar.s.setVisibility(8);
        } else {
            hmVar.s.setText(hmVar.t);
            Drawable drawable2 = hmVar.v;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, i7, i7);
                hmVar.s.setCompoundDrawables(hmVar.v, null, null, null);
            }
            hmVar.s.setVisibility(0);
            i |= 2;
        }
        Button button3 = (Button) b3.findViewById(android.R.id.button3);
        hmVar.w = button3;
        button3.setOnClickListener(k8Var);
        if (TextUtils.isEmpty(hmVar.x) && hmVar.z == null) {
            hmVar.w.setVisibility(8);
            view = null;
        } else {
            hmVar.w.setText(hmVar.x);
            Drawable drawable3 = hmVar.z;
            if (drawable3 != null) {
                drawable3.setBounds(0, 0, i7, i7);
                view = null;
                hmVar.w.setCompoundDrawables(hmVar.z, null, null, null);
            } else {
                view = null;
            }
            hmVar.w.setVisibility(0);
            i |= 4;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogCenterButtons, typedValue, true);
        if (typedValue.data != 0) {
            if (i == 1) {
                Button button4 = hmVar.o;
                LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) button4.getLayoutParams();
                layoutParams.gravity = 1;
                layoutParams.weight = 0.5f;
                button4.setLayoutParams(layoutParams);
            } else if (i == 2) {
                Button button5 = hmVar.s;
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) button5.getLayoutParams();
                layoutParams2.gravity = 1;
                layoutParams2.weight = 0.5f;
                button5.setLayoutParams(layoutParams2);
            } else if (i == 4) {
                Button button6 = hmVar.w;
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) button6.getLayoutParams();
                layoutParams3.gravity = 1;
                layoutParams3.weight = 0.5f;
                button6.setLayoutParams(layoutParams3);
            }
        }
        if (i == 0) {
            b3.setVisibility(8);
        }
        if (hmVar.G != null) {
            b.addView(hmVar.G, 0, new ViewGroup.LayoutParams(-1, -2));
            window.findViewById(R.id.title_template).setVisibility(8);
        } else {
            hmVar.D = (ImageView) window.findViewById(android.R.id.icon);
            if (!TextUtils.isEmpty(hmVar.e) && hmVar.O) {
                TextView textView2 = (TextView) window.findViewById(R.id.alertTitle);
                hmVar.E = textView2;
                textView2.setText(hmVar.e);
                int i8 = hmVar.B;
                if (i8 != 0) {
                    hmVar.D.setImageResource(i8);
                } else {
                    Drawable drawable4 = hmVar.C;
                    if (drawable4 != null) {
                        hmVar.D.setImageDrawable(drawable4);
                    } else {
                        hmVar.E.setPadding(hmVar.D.getPaddingLeft(), hmVar.D.getPaddingTop(), hmVar.D.getPaddingRight(), hmVar.D.getPaddingBottom());
                        hmVar.D.setVisibility(8);
                    }
                }
            } else {
                window.findViewById(R.id.title_template).setVisibility(8);
                hmVar.D.setVisibility(8);
                b.setVisibility(8);
            }
        }
        if (viewGroup.getVisibility() != 8) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (b != null && b.getVisibility() != 8) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        if (b3.getVisibility() != 8) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (!z3 && (findViewById2 = b2.findViewById(R.id.textSpacerNoButtons)) != null) {
            findViewById2.setVisibility(0);
        }
        if (i2 != 0) {
            NestedScrollView nestedScrollView2 = hmVar.A;
            if (nestedScrollView2 != null) {
                nestedScrollView2.setClipToPadding(true);
            }
            if (hmVar.f == null && hmVar.g == null) {
                findViewById = view;
            } else {
                findViewById = b.findViewById(R.id.titleDividerNoCustom);
            }
            i3 = 0;
            if (findViewById != null) {
                findViewById.setVisibility(0);
            }
        } else {
            i3 = 0;
            View findViewById10 = b2.findViewById(R.id.textSpacerNoTitle);
            if (findViewById10 != null) {
                findViewById10.setVisibility(0);
            }
        }
        AlertController$RecycleListView alertController$RecycleListView = hmVar.g;
        if (alertController$RecycleListView != null && (!z3 || i2 == 0)) {
            int paddingLeft = alertController$RecycleListView.getPaddingLeft();
            if (i2 != 0) {
                i5 = alertController$RecycleListView.getPaddingTop();
            } else {
                i5 = alertController$RecycleListView.a;
            }
            int paddingRight = alertController$RecycleListView.getPaddingRight();
            if (z3) {
                i6 = alertController$RecycleListView.getPaddingBottom();
            } else {
                i6 = alertController$RecycleListView.b;
            }
            alertController$RecycleListView.setPadding(paddingLeft, i5, paddingRight, i6);
        }
        if (!z2) {
            View view3 = hmVar.g;
            if (view3 == null) {
                view3 = hmVar.A;
            }
            if (view3 != null) {
                if (z3) {
                    i4 = 2;
                } else {
                    i4 = i3;
                }
                View findViewById11 = window.findViewById(R.id.scrollIndicatorUp);
                View findViewById12 = window.findViewById(R.id.scrollIndicatorDown);
                WeakHashMap weakHashMap = k9k.a;
                view3.setScrollIndicators(i2 | i4, 3);
                if (findViewById11 != null) {
                    b2.removeView(findViewById11);
                }
                if (findViewById12 != null) {
                    b2.removeView(findViewById12);
                }
            }
        }
        AlertController$RecycleListView alertController$RecycleListView2 = hmVar.g;
        if (alertController$RecycleListView2 != null && (listAdapter = hmVar.H) != null) {
            alertController$RecycleListView2.setAdapter(listAdapter);
            int i9 = hmVar.I;
            if (i9 > -1) {
                alertController$RecycleListView2.setItemChecked(i9, true);
                alertController$RecycleListView2.setSelection(i9);
            }
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.A;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.g.A;
        if (nestedScrollView != null && nestedScrollView.j(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // defpackage.cg0, android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        super.setTitle(charSequence);
        hm hmVar = this.g;
        hmVar.e = charSequence;
        TextView textView = hmVar.E;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }
}
