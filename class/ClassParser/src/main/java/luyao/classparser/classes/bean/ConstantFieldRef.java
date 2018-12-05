package luyao.classparser.classes.bean;


import luyao.classparser.utils.Reader;

import java.io.IOException;

/**
 * Created by luyao
 * on 2018/8/27 15:32
 */
public class ConstantFieldRef extends Constant {

    public int class_index;
    public int name_and_type_index;

    public ConstantFieldRef() {
        super(ConstantTag.FIELD_REF);
    }

    public ConstantFieldRef(int class_index, int name_and_type_index) {
        super(ConstantTag.FIELD_REF);
        this.class_index = class_index;
        this.name_and_type_index = name_and_type_index;
    }

    @Override
    public void read(Reader reader) {
        try {
            this.class_index = reader.readUnsignedShort();
            this.name_and_type_index = reader.readUnsignedShort();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String toString() {
        return "ConstantFieldRef{" + "tag=" + tag +
                ", class_index=" + class_index +
                ", name_and_type_index=" + name_and_type_index +
                '}';
    }
}
