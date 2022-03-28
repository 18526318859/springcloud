package com.cloud.pojo;

        import lombok.Data;
        import lombok.NoArgsConstructor;
        import lombok.experimental.Accessors;

        import java.io.Serializable;
@Data
@NoArgsConstructor
@Accessors(chain = true)//链式开启
public class Dept implements Serializable {
    private long deptno;
    private  String  dname;
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
