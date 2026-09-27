package com.checkout.address.ui.navigation;

import com.checkout.address.ui.navigation.Screen;
import com.checkout.components.ui.model.CountryPickerType;
import com.google.android.libraries.places.api.model.PlaceTypes;
import defpackage.b2i;
import defpackage.dmk;
import defpackage.dse;
import defpackage.hm6;
import defpackage.iwm;
import defpackage.us8;
import defpackage.xq4;
import defpackage.yq4;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
@hm6
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\r¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"com/checkout/address/ui/navigation/Screen.CountryPicker.$serializer", "Lus8;", "Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/checkout/address/ui/navigation/Screen$CountryPicker;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/checkout/address/ui/navigation/Screen$CountryPicker;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "address_standardRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* synthetic */ class Screen$CountryPicker$$serializer implements us8 {
    public static final int $stable = 8;
    public static final Screen$CountryPicker$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Screen$CountryPicker$$serializer screen$CountryPicker$$serializer = new Screen$CountryPicker$$serializer();
        INSTANCE = screen$CountryPicker$$serializer;
        dse dseVar = new dse("com.checkout.address.ui.navigation.Screen.CountryPicker", screen$CountryPicker$$serializer, 2);
        dseVar.j(PlaceTypes.ROUTE, false);
        dseVar.j("type", false);
        descriptor = dseVar;
    }

    private Screen$CountryPicker$$serializer() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.us8
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b2i.a, Screen.CountryPicker.access$get$childSerializers$cp()[1].getValue()};
    }

    @Override // kotlinx.serialization.KSerializer
    public final Screen.CountryPicker deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        xq4 a = decoder.a(serialDescriptor);
        Lazy[] access$get$childSerializers$cp = Screen.CountryPicker.access$get$childSerializers$cp();
        boolean z = true;
        int i = 0;
        String str = null;
        CountryPickerType countryPickerType = null;
        while (z) {
            int p = a.p(serialDescriptor);
            if (p != -1) {
                if (p != 0) {
                    if (p == 1) {
                        countryPickerType = (CountryPickerType) a.D(serialDescriptor, 1, (KSerializer) access$get$childSerializers$cp[1].getValue(), countryPickerType);
                        i |= 2;
                    } else {
                        dmk.b(p);
                        return null;
                    }
                } else {
                    str = a.o(serialDescriptor, 0);
                    i |= 1;
                }
            } else {
                z = false;
            }
        }
        a.b(serialDescriptor);
        return new Screen.CountryPicker(i, str, countryPickerType, null);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder encoder, Screen.CountryPicker value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor serialDescriptor = descriptor;
        yq4 a = encoder.a(serialDescriptor);
        Screen.CountryPicker.write$Self$address_standardRelease(value, a, serialDescriptor);
        a.b(serialDescriptor);
    }

    @Override // defpackage.us8
    public final KSerializer[] typeParametersSerializers() {
        return iwm.a;
    }

    @Override // kotlinx.serialization.KSerializer
    public final /* bridge */ /* synthetic */ void serialize(Encoder encoder, Object obj) {
        serialize(encoder, (Screen.CountryPicker) obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public final /* bridge */ /* synthetic */ Object deserialize(Decoder decoder) {
        return deserialize(decoder);
    }
}
