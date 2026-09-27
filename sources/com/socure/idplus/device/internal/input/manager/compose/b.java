package com.socure.idplus.device.internal.input.manager.compose;

import androidx.compose.ui.text.input.ImeOptions;
import androidx.compose.ui.text.input.OffsetMapping;
import androidx.compose.ui.text.input.PlatformTextInputService;
import androidx.compose.ui.text.input.TextFieldValue;
import com.socure.idplus.device.internal.behavior.model.InputChangeAction;
import defpackage.gb0;
import defpackage.m6m;
import defpackage.zrf;
import defpackage.zwi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes5.dex */
public final class b implements PlatformTextInputService {
    public final PlatformTextInputService a;
    public final /* synthetic */ d b;

    public b(d dVar, PlatformTextInputService platformTextInputService) {
        platformTextInputService.getClass();
        this.b = dVar;
        this.a = platformTextInputService;
    }

    public final void a(int i, TextFieldValue textFieldValue, String str) {
        d dVar;
        String str2;
        int length = str.length();
        gb0 gb0Var = textFieldValue.a;
        gb0 gb0Var2 = textFieldValue.a;
        int i2 = length + i;
        if (gb0Var.b.length() >= i2 && Intrinsics.areEqual(gb0Var2.b.subSequence(i, i2).toString(), str) && (str2 = (dVar = this.b).e) != null) {
            dVar.a(gb0Var2.b, str2, InputChangeAction.PASTE);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void hideSoftwareKeyboard() {
        this.a.hideSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void notifyFocusedRect(zrf zrfVar) {
        zrfVar.getClass();
        this.a.notifyFocusedRect(zrfVar);
        d dVar = this.b;
        if (dVar.e == null) {
            dVar.f.set((int) zrfVar.a, (int) zrfVar.b, (int) zrfVar.c, (int) zrfVar.d);
            d dVar2 = this.b;
            String a = dVar2.a(dVar2.f);
            d dVar3 = this.b;
            dVar3.e = a;
            dVar3.c.a(true);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void showSoftwareKeyboard() {
        this.a.showSoftwareKeyboard();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput(TextFieldValue textFieldValue, ImeOptions imeOptions, Function1 function1, Function1 function12) {
        textFieldValue.getClass();
        imeOptions.getClass();
        function1.getClass();
        function12.getClass();
        d dVar = this.b;
        boolean z = dVar.i;
        PlatformTextInputService platformTextInputService = this.a;
        if (!z) {
            platformTextInputService.startInput(textFieldValue, imeOptions, function1, function12);
        } else {
            platformTextInputService.startInput(textFieldValue, imeOptions, new a(dVar, function1), function12);
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void stopInput() {
        d dVar = this.b;
        if (!dVar.i) {
            this.a.stopInput();
            return;
        }
        if (dVar.e != null) {
            dVar.c.a(false);
        }
        d dVar2 = this.b;
        dVar2.h = null;
        dVar2.e = null;
        this.a.stopInput();
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateState(TextFieldValue textFieldValue, TextFieldValue textFieldValue2) {
        d dVar;
        String str;
        String str2;
        d dVar2;
        String str3;
        textFieldValue2.getClass();
        gb0 gb0Var = textFieldValue2.a;
        this.a.updateState(textFieldValue, textFieldValue2);
        d dVar3 = this.b;
        if (dVar3.i && dVar3.e != null) {
            if (dVar3.b.b) {
                if (textFieldValue != null) {
                    str2 = m6m.b(textFieldValue).b;
                } else {
                    str2 = null;
                }
                if (str2 == null) {
                    str2 = "";
                }
                String str4 = m6m.b(textFieldValue2).b;
                String valueOf = String.valueOf(this.b.a());
                if (str2.length() > 0 && str4.length() == 0) {
                    if (Intrinsics.areEqual(str2, valueOf) && (str3 = (dVar2 = this.b).e) != null) {
                        dVar2.a(str4, str3, InputChangeAction.CUT);
                    }
                } else {
                    if (textFieldValue == null) {
                        textFieldValue = new TextFieldValue(7, 0L, (String) null);
                    }
                    gb0 gb0Var2 = textFieldValue.a;
                    String str5 = gb0Var2.b;
                    String str6 = gb0Var2.b;
                    int length = str5.length();
                    String str7 = gb0Var.b;
                    String str8 = gb0Var.b;
                    if (length < str7.length()) {
                        String valueOf2 = String.valueOf(this.b.a());
                        if (str6.length() == 0) {
                            a(0, textFieldValue2, valueOf2);
                        } else {
                            int i = 0;
                            int i2 = 0;
                            int i3 = 0;
                            while (true) {
                                if (i < str6.length()) {
                                    int i4 = i3 + 1;
                                    if (str6.charAt(i) != str8.charAt(i3)) {
                                        a(i3, textFieldValue2, valueOf2);
                                        break;
                                    } else {
                                        i++;
                                        i2 = i3;
                                        i3 = i4;
                                    }
                                } else {
                                    int i5 = i2 + 1;
                                    if (i5 < str8.length()) {
                                        a(i5, textFieldValue2, valueOf2);
                                    }
                                }
                            }
                        }
                    }
                }
                this.b.b.b = false;
                return;
            }
            if (textFieldValue != null && !Intrinsics.areEqual(dVar3.h, gb0Var.b) && (str = (dVar = this.b).e) != null) {
                dVar.a(gb0Var.b, str, InputChangeAction.UNKNOWN);
            }
        }
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void updateTextLayoutResult(TextFieldValue textFieldValue, OffsetMapping offsetMapping, zwi zwiVar, Function1 function1, zrf zrfVar, zrf zrfVar2) {
        textFieldValue.getClass();
        offsetMapping.getClass();
        zwiVar.getClass();
        function1.getClass();
        zrfVar.getClass();
        zrfVar2.getClass();
        this.a.updateTextLayoutResult(textFieldValue, offsetMapping, zwiVar, function1, zrfVar, zrfVar2);
    }

    @Override // androidx.compose.ui.text.input.PlatformTextInputService
    public final void startInput() {
        this.a.startInput();
    }
}
