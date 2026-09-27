package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.polymarket.android.R;
import defpackage.bm9;
import defpackage.cci;
import defpackage.eg5;
import defpackage.f94;
import defpackage.hf0;
import defpackage.i9k;
import defpackage.k9k;
import defpackage.kjb;
import defpackage.l0;
import defpackage.m5j;
import defpackage.mc1;
import defpackage.mmg;
import defpackage.nmg;
import defpackage.omg;
import defpackage.pmg;
import defpackage.qmg;
import defpackage.rmg;
import defpackage.smg;
import defpackage.tmg;
import defpackage.u8b;
import defpackage.ug0;
import defpackage.ulf;
import defpackage.wh1;
import io.ably.lib.util.AgentHeaderCreator;
import io.sentry.android.core.m0;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public class SearchView extends u8b implements f94 {
    public static final /* synthetic */ int t1 = 0;
    public final Rect A;
    public final int[] B;
    public final int[] C;
    public final ImageView D;
    public final Drawable E;
    public final int F;
    public final int G;
    public final Intent H;
    public final Intent I;
    public final CharSequence J;
    public View.OnFocusChangeListener K;
    public View.OnClickListener L;
    public boolean M;
    public boolean N;
    public eg5 O;
    public boolean P;
    public CharSequence Q;
    public boolean R;
    public boolean S;
    public int T;
    public boolean V;
    public CharSequence W;
    public boolean f1;
    public int n1;
    public SearchableInfo o1;
    public final SearchAutoComplete p;
    public Bundle p1;
    public final View q;
    public final mmg q1;
    public final View r;
    public final mmg r1;
    public final View s;
    public final WeakHashMap s1;
    public final ImageView t;
    public final ImageView u;
    public final ImageView v;
    public final ImageView w;
    public final View x;
    public tmg y;
    public final Rect z;

    public SearchView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.searchViewStyle);
        this.z = new Rect();
        this.A = new Rect();
        this.B = new int[2];
        this.C = new int[2];
        this.q1 = new mmg(this, 0);
        this.r1 = new mmg(this, 1);
        this.s1 = new WeakHashMap();
        b bVar = new b(this);
        c cVar = new c(this);
        omg omgVar = new omg(this);
        ug0 ug0Var = new ug0(this, 2);
        kjb kjbVar = new kjb(this, 1);
        mc1 mc1Var = new mc1(this, 4);
        int[] iArr = ulf.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.searchViewStyle, 0);
        bm9 bm9Var = new bm9(context, obtainStyledAttributes);
        WeakHashMap weakHashMap = k9k.a;
        i9k.b(this, context, iArr, attributeSet, obtainStyledAttributes, R.attr.searchViewStyle, 0);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(21, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.p = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.q = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.r = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.s = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.t = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.u = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.v = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.w = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.D = imageView5;
        findViewById.setBackground(bm9Var.p(22));
        findViewById2.setBackground(bm9Var.p(27));
        imageView.setImageDrawable(bm9Var.p(25));
        imageView2.setImageDrawable(bm9Var.p(17));
        imageView3.setImageDrawable(bm9Var.p(12));
        imageView4.setImageDrawable(bm9Var.p(30));
        imageView5.setImageDrawable(bm9Var.p(25));
        this.E = bm9Var.p(24);
        m5j.a(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.F = obtainStyledAttributes.getResourceId(28, R.layout.abc_search_dropdown_item_icons_2line);
        this.G = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(bVar);
        imageView3.setOnClickListener(bVar);
        imageView2.setOnClickListener(bVar);
        imageView4.setOnClickListener(bVar);
        searchAutoComplete.setOnClickListener(bVar);
        searchAutoComplete.addTextChangedListener(mc1Var);
        searchAutoComplete.setOnEditorActionListener(omgVar);
        searchAutoComplete.setOnItemClickListener(ug0Var);
        searchAutoComplete.setOnItemSelectedListener(kjbVar);
        searchAutoComplete.setOnKeyListener(cVar);
        searchAutoComplete.setOnFocusChangeListener(new nmg(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(20, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.J = obtainStyledAttributes.getText(15);
        this.Q = obtainStyledAttributes.getText(23);
        int i = obtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = obtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        bm9Var.F();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.H = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.I = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.x = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new wh1(this, 2));
        }
        v(this.M);
        s();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.S = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.S = false;
    }

    public int getImeOptions() {
        return this.p.getImeOptions();
    }

    public int getInputType() {
        return this.p.getInputType();
    }

    public int getMaxWidth() {
        return this.T;
    }

    public CharSequence getQuery() {
        return this.p.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.o1;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.o1.getHintId());
        }
        return this.J;
    }

    public int getSuggestionCommitIconResId() {
        return this.G;
    }

    public int getSuggestionRowLayout() {
        return this.F;
    }

    public eg5 getSuggestionsAdapter() {
        return this.O;
    }

    public final Intent j(String str, String str2, Uri uri, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.p1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.o1.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.p1;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        SearchAutoComplete searchAutoComplete = this.p;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.M) {
                clearFocus();
                v(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void m(int i) {
        int i2;
        Uri parse;
        String h;
        Cursor cursor = this.O.c;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = cci.x;
                String h2 = cci.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h2 == null) {
                    h2 = this.o1.getSuggestIntentAction();
                }
                if (h2 == null) {
                    h2 = "android.intent.action.SEARCH";
                }
                String h3 = cci.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h3 == null) {
                    h3 = this.o1.getSuggestIntentData();
                }
                if (h3 != null && (h = cci.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h3 = h3 + AgentHeaderCreator.AGENT_DIVIDER + Uri.encode(h);
                }
                if (h3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h3);
                }
                intent = j(h2, cci.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), parse, cci.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                m0.q("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    m0.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void n(int i) {
        Editable text = this.p.getText();
        Cursor cursor = this.O.c;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                String c = this.O.c(cursor);
                if (c != null) {
                    setQuery(c);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    public final void o(CharSequence charSequence) {
        setQuery(charSequence);
    }

    @Override // defpackage.f94
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.W = "";
        clearFocus();
        v(true);
        searchAutoComplete.setImeOptions(this.n1);
        this.f1 = false;
    }

    @Override // defpackage.f94
    public final void onActionViewExpanded() {
        if (this.f1) {
            return;
        }
        this.f1 = true;
        SearchAutoComplete searchAutoComplete = this.p;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.n1 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.q1);
        post(this.r1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.u8b, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.p;
            int[] iArr = this.B;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.C;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            int width = searchAutoComplete.getWidth() + i6;
            int height = searchAutoComplete.getHeight() + i5;
            Rect rect = this.z;
            rect.set(i6, i5, width, height);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.A;
            rect2.set(i7, 0, i8, i9);
            tmg tmgVar = this.y;
            if (tmgVar == null) {
                tmg tmgVar2 = new tmg(searchAutoComplete, rect2, rect);
                this.y = tmgVar2;
                setTouchDelegate(tmgVar2);
            } else {
                tmgVar.b.set(rect2);
                Rect rect3 = tmgVar.d;
                rect3.set(rect2);
                int i10 = -tmgVar.e;
                rect3.inset(i10, i10);
                tmgVar.c.set(rect);
            }
        }
    }

    @Override // defpackage.u8b, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.N) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.T) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.T;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.T;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof smg)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        smg smgVar = (smg) parcelable;
        super.onRestoreInstanceState(smgVar.a);
        v(smgVar.c);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [android.os.Parcelable, l0, smg] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? l0Var = new l0(super.onSaveInstanceState());
        l0Var.c = this.N;
        return l0Var;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.q1);
    }

    public final void p() {
        SearchAutoComplete searchAutoComplete = this.p;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.o1 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void q() {
        int i;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        if (isEmpty && (!this.M || this.f1)) {
            i = 8;
        } else {
            i = 0;
        }
        ImageView imageView = this.v;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    public final void r() {
        int[] iArr;
        if (this.p.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.s.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.S || !isFocusable()) {
            return false;
        }
        if (!this.N) {
            boolean requestFocus = this.p.requestFocus(i, rect);
            if (requestFocus) {
                v(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public final void s() {
        Drawable drawable;
        CharSequence queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.M;
        SearchAutoComplete searchAutoComplete = this.p;
        if (z && (drawable = this.E) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public void setAppSearchData(Bundle bundle) {
        this.p1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            l();
            return;
        }
        v(false);
        SearchAutoComplete searchAutoComplete = this.p;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.M == z) {
            return;
        }
        this.M = z;
        v(z);
        s();
    }

    public void setImeOptions(int i) {
        this.p.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.p.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.T = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K = onFocusChangeListener;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q = charSequence;
        s();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.R = z;
        eg5 eg5Var = this.O;
        if (eg5Var instanceof cci) {
            cci cciVar = (cci) eg5Var;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            cciVar.p = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0095, code lost:
    
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i;
        this.o1 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.p;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.o1.getImeOptions());
            int inputType = this.o1.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.o1.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            eg5 eg5Var = this.O;
            if (eg5Var != null) {
                eg5Var.b(null);
            }
            if (this.o1.getSuggestAuthority() != null) {
                cci cciVar = new cci(getContext(), this, this.o1, this.s1);
                this.O = cciVar;
                searchAutoComplete.setAdapter(cciVar);
                cci cciVar2 = (cci) this.O;
                if (this.R) {
                    i = 2;
                } else {
                    i = 1;
                }
                cciVar2.p = i;
            }
            s();
        }
        SearchableInfo searchableInfo2 = this.o1;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.o1.getVoiceSearchLaunchWebSearch()) {
                intent = this.H;
            } else if (this.o1.getVoiceSearchLaunchRecognizer()) {
                intent = this.I;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.V = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        v(this.N);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.P = z;
        v(this.N);
    }

    public void setSuggestionsAdapter(eg5 eg5Var) {
        this.O = eg5Var;
        this.p.setAdapter(eg5Var);
    }

    public final void t() {
        int i;
        if ((this.P || this.V) && !this.N && (this.u.getVisibility() == 0 || this.w.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.s.setVisibility(i);
    }

    public final void u(boolean z) {
        int i;
        boolean z2 = this.P;
        if (z2 && ((z2 || this.V) && !this.N && hasFocus() && (z || !this.V))) {
            i = 0;
        } else {
            i = 8;
        }
        this.u.setVisibility(i);
    }

    public final void v(boolean z) {
        int i;
        int i2;
        int i3;
        this.N = z;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.p.getText());
        this.t.setVisibility(i);
        u(!isEmpty);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.q.setVisibility(i2);
        ImageView imageView = this.D;
        if (imageView.getDrawable() != null && !this.M) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        q();
        if (this.V && !this.N && isEmpty) {
            this.u.setVisibility(8);
            i4 = 0;
        }
        this.w.setVisibility(i4);
        t();
    }

    /* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends hf0 {
        public int e;
        public SearchView f;
        public boolean g;
        public final e h;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.h = new e(this);
            this.e = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.e > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.hf0, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.g) {
                e eVar = this.h;
                removeCallbacks(eVar);
                post(eVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.f;
            searchView.v(searchView.N);
            searchView.post(searchView.q1);
            SearchAutoComplete searchAutoComplete = searchView.p;
            if (searchAutoComplete.hasFocus()) {
                d.a(searchAutoComplete);
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                }
                if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.f.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.f.hasFocus() && getVisibility() == 0) {
                this.g = true;
                Context context = getContext();
                int i = SearchView.t1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    d.b(this, 1);
                    if (enoughToFilter()) {
                        showDropDown();
                    }
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            e eVar = this.h;
            if (!z) {
                this.g = false;
                removeCallbacks(eVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else {
                if (inputMethodManager.isActive(this)) {
                    this.g = false;
                    removeCallbacks(eVar);
                    inputMethodManager.showSoftInput(this, 0);
                    return;
                }
                this.g = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.e = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(pmg pmgVar) {
    }

    public void setOnQueryTextListener(qmg qmgVar) {
    }

    public void setOnSuggestionListener(rmg rmgVar) {
    }
}
