package defpackage;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
import kotlin.Lazy;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* compiled from: r8-map-id-826db3e0ccd5eff4e36cfb5c0bfeee0451562e7e7652a4d6d90edd453ef96714 */
/* loaded from: classes6.dex */
public final class tob implements KSerializer {
    public static final tob a = new Object();
    public static final v5f b = a2l.a("kotlinx.datetime.LocalDate", q5f.o);

    @Override // kotlinx.serialization.KSerializer
    public final Object deserialize(Decoder decoder) {
        nob nobVar = pob.Companion;
        String y = decoder.y();
        int i = oob.a;
        Lazy lazy = rob.a;
        qob qobVar = (qob) lazy.getValue();
        nobVar.getClass();
        y.getClass();
        qobVar.getClass();
        if (qobVar == ((qob) lazy.getValue())) {
            try {
                String obj = y.toString();
                obj.getClass();
                return new pob(LocalDate.parse(r1n.d(6, obj.toString())));
            } catch (DateTimeParseException e) {
                throw new IllegalArgumentException(e);
            }
        }
        return (pob) qobVar.a(y);
    }

    @Override // kotlinx.serialization.KSerializer
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        pob pobVar = (pob) obj;
        pobVar.getClass();
        encoder.F(pobVar.toString());
    }
}
