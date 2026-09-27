package androidx.appcompat.widget;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import androidx.appcompat.widget.SearchView;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes.dex */
public final class c implements View.OnKeyListener {
    public final /* synthetic */ SearchView a;

    public c(SearchView searchView) {
        this.a = searchView;
    }

    @Override // android.view.View.OnKeyListener
    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        int length;
        SearchView searchView = this.a;
        SearchView.SearchAutoComplete searchAutoComplete = searchView.p;
        if (searchView.o1 != null) {
            if (searchAutoComplete.isPopupShowing() && searchAutoComplete.getListSelection() != -1) {
                if (searchView.o1 != null && searchView.O != null && keyEvent.getAction() == 0 && keyEvent.hasNoModifiers()) {
                    if (i != 66 && i != 84 && i != 61) {
                        if (i != 21 && i != 22) {
                            if (i == 19) {
                                searchAutoComplete.getListSelection();
                                return false;
                            }
                        } else {
                            if (i == 21) {
                                length = 0;
                            } else {
                                length = searchAutoComplete.length();
                            }
                            searchAutoComplete.setSelection(length);
                            searchAutoComplete.setListSelection(0);
                            searchAutoComplete.clearListSelection();
                            d.b(searchAutoComplete, 1);
                            if (searchAutoComplete.enoughToFilter()) {
                                searchAutoComplete.showDropDown();
                            }
                            return true;
                        }
                    } else {
                        searchView.m(searchAutoComplete.getListSelection());
                        return true;
                    }
                }
            } else if (TextUtils.getTrimmedLength(searchAutoComplete.getText()) != 0 && keyEvent.hasNoModifiers() && keyEvent.getAction() == 1 && i == 66) {
                view.cancelLongPress();
                searchView.getContext().startActivity(searchView.j("android.intent.action.SEARCH", null, null, searchAutoComplete.getText().toString()));
                return true;
            }
        }
        return false;
    }
}
