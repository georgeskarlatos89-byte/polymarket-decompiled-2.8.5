package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.polymarket.android.R;
import defpackage.bm9;
import defpackage.cac;
import defpackage.ebc;
import defpackage.kac;
import defpackage.ulf;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements ebc, AbsListView.SelectionBoundsAdjuster {
    public kac a;
    public ImageView b;
    public RadioButton c;
    public TextView d;
    public CheckBox e;
    public TextView f;
    public ImageView g;
    public ImageView h;
    public LinearLayout i;
    public final Drawable j;
    public final int k;
    public final Context l;
    public boolean m;
    public final Drawable n;
    public final boolean o;
    public LayoutInflater p;
    public boolean q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        bm9 C = bm9.C(R.attr.listMenuViewStyle, 0, getContext(), attributeSet, ulf.r);
        this.j = C.p(5);
        TypedArray typedArray = (TypedArray) C.c;
        this.k = typedArray.getResourceId(1, -1);
        this.m = typedArray.getBoolean(7, false);
        this.l = context;
        this.n = C.p(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{android.R.attr.divider}, R.attr.dropDownListViewStyle, 0);
        this.o = obtainStyledAttributes.hasValue(0);
        C.F();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        LayoutInflater layoutInflater = this.p;
        if (layoutInflater == null) {
            LayoutInflater from = LayoutInflater.from(getContext());
            this.p = from;
            return from;
        }
        return layoutInflater;
    }

    private void setSubMenuArrowVisible(boolean z) {
        int i;
        ImageView imageView = this.g;
        if (imageView != null) {
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.h;
        if (imageView != null && imageView.getVisibility() == 0) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.h.getLayoutParams();
            rect.top = this.h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0050, code lost:
    
        if (r0 != 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0116  */
    @Override // defpackage.ebc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(kac kacVar) {
        int i;
        boolean z;
        char c;
        int i2;
        String sb;
        char c2;
        char c3;
        this.a = kacVar;
        boolean isVisible = kacVar.isVisible();
        cac cacVar = kacVar.n;
        int i3 = 0;
        if (isVisible) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setTitle(kacVar.e);
        setCheckable(kacVar.isCheckable());
        if (cacVar.o()) {
            if (cacVar.n()) {
                c3 = kacVar.j;
            } else {
                c3 = kacVar.h;
            }
            if (c3 != 0) {
                z = true;
                cacVar.n();
                if (z) {
                    kac kacVar2 = this.a;
                    cac cacVar2 = kacVar2.n;
                    if (cacVar2.o()) {
                        if (cacVar2.n()) {
                            c2 = kacVar2.j;
                        } else {
                            c2 = kacVar2.h;
                        }
                    }
                }
                i3 = 8;
                if (i3 == 0) {
                    TextView textView = this.f;
                    kac kacVar3 = this.a;
                    cac cacVar3 = kacVar3.n;
                    Context context = cacVar3.a;
                    if (cacVar3.n()) {
                        c = kacVar3.j;
                    } else {
                        c = kacVar3.h;
                    }
                    if (c == 0) {
                        sb = "";
                    } else {
                        Resources resources = context.getResources();
                        StringBuilder sb2 = new StringBuilder();
                        if (ViewConfiguration.get(context).hasPermanentMenuKey()) {
                            sb2.append(resources.getString(R.string.abc_prepend_shortcut_label));
                        }
                        if (cacVar3.n()) {
                            i2 = kacVar3.k;
                        } else {
                            i2 = kacVar3.i;
                        }
                        kac.c(sb2, resources.getString(R.string.abc_menu_meta_shortcut_label), i2, 65536);
                        kac.c(sb2, resources.getString(R.string.abc_menu_ctrl_shortcut_label), i2, 4096);
                        kac.c(sb2, resources.getString(R.string.abc_menu_alt_shortcut_label), i2, 2);
                        kac.c(sb2, resources.getString(R.string.abc_menu_shift_shortcut_label), i2, 1);
                        kac.c(sb2, resources.getString(R.string.abc_menu_sym_shortcut_label), i2, 4);
                        kac.c(sb2, resources.getString(R.string.abc_menu_function_shortcut_label), i2, 8);
                        if (c != '\b') {
                            if (c != '\n') {
                                if (c != ' ') {
                                    sb2.append(c);
                                } else {
                                    sb2.append(resources.getString(R.string.abc_menu_space_shortcut_label));
                                }
                            } else {
                                sb2.append(resources.getString(R.string.abc_menu_enter_shortcut_label));
                            }
                        } else {
                            sb2.append(resources.getString(R.string.abc_menu_delete_shortcut_label));
                        }
                        sb = sb2.toString();
                    }
                    textView.setText(sb);
                }
                if (this.f.getVisibility() != i3) {
                    this.f.setVisibility(i3);
                }
                setIcon(kacVar.getIcon());
                setEnabled(kacVar.isEnabled());
                setSubMenuArrowVisible(kacVar.hasSubMenu());
                setContentDescription(kacVar.q);
            }
        }
        z = false;
        cacVar.n();
        if (z) {
        }
        i3 = 8;
        if (i3 == 0) {
        }
        if (this.f.getVisibility() != i3) {
        }
        setIcon(kacVar.getIcon());
        setEnabled(kacVar.isEnabled());
        setSubMenuArrowVisible(kacVar.hasSubMenu());
        setContentDescription(kacVar.q);
    }

    @Override // defpackage.ebc
    public kac getItemData() {
        return this.a;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.j);
        TextView textView = (TextView) findViewById(R.id.title);
        this.d = textView;
        int i = this.k;
        if (i != -1) {
            textView.setTextAppearance(this.l, i);
        }
        this.f = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.n);
        }
        this.h = (ImageView) findViewById(R.id.group_divider);
        this.i = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.b != null && this.m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.b.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        CompoundButton compoundButton2;
        CompoundButton compoundButton3;
        if (z || this.c != null || this.e != null) {
            if ((this.a.x & 4) != 0) {
                if (this.c == null) {
                    RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                    this.c = radioButton;
                    LinearLayout linearLayout = this.i;
                    if (linearLayout != null) {
                        linearLayout.addView(radioButton, -1);
                    } else {
                        addView(radioButton, -1);
                    }
                }
                compoundButton = this.c;
                compoundButton2 = this.e;
                compoundButton3 = compoundButton2;
            } else {
                if (this.e == null) {
                    CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                    this.e = checkBox;
                    LinearLayout linearLayout2 = this.i;
                    if (linearLayout2 != null) {
                        linearLayout2.addView(checkBox, -1);
                    } else {
                        addView(checkBox, -1);
                    }
                }
                compoundButton = this.e;
                compoundButton2 = this.c;
                compoundButton3 = compoundButton;
            }
            if (z) {
                compoundButton.setChecked(this.a.isChecked());
                if (compoundButton.getVisibility() != 0) {
                    compoundButton.setVisibility(0);
                }
                if (compoundButton2 != null && compoundButton2.getVisibility() != 8) {
                    compoundButton2.setVisibility(8);
                    return;
                }
                return;
            }
            if (compoundButton3 != null) {
                compoundButton3.setVisibility(8);
            }
            RadioButton radioButton2 = this.c;
            if (radioButton2 != null) {
                radioButton2.setVisibility(8);
            }
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.a.x & 4) != 0) {
            if (this.c == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.c = radioButton;
                LinearLayout linearLayout = this.i;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.c;
        } else {
            if (this.e == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.e = checkBox;
                LinearLayout linearLayout2 = this.i;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.e;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.q = z;
        this.m = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        int i;
        ImageView imageView = this.h;
        if (imageView != null) {
            if (!this.o && z) {
                i = 0;
            } else {
                i = 8;
            }
            imageView.setVisibility(i);
        }
    }

    public void setIcon(Drawable drawable) {
        cac cacVar = this.a.n;
        boolean z = this.q;
        if (z || this.m) {
            ImageView imageView = this.b;
            if (imageView != null || drawable != null || this.m) {
                if (imageView == null) {
                    ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
                    this.b = imageView2;
                    LinearLayout linearLayout = this.i;
                    if (linearLayout != null) {
                        linearLayout.addView(imageView2, 0);
                    } else {
                        addView(imageView2, 0);
                    }
                }
                if (drawable == null && !this.m) {
                    this.b.setVisibility(8);
                    return;
                }
                ImageView imageView3 = this.b;
                if (!z) {
                    drawable = null;
                }
                imageView3.setImageDrawable(drawable);
                if (this.b.getVisibility() != 0) {
                    this.b.setVisibility(0);
                }
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        TextView textView = this.d;
        if (charSequence != null) {
            textView.setText(charSequence);
            if (this.d.getVisibility() != 0) {
                this.d.setVisibility(0);
                return;
            }
            return;
        }
        if (textView.getVisibility() != 8) {
            this.d.setVisibility(8);
        }
    }
}
