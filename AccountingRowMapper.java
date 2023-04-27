package org.example.accounting.utils;

import org.example.accounting.model.Accounting;
import org.example.accounting.model.Car;
import org.example.accounting.model.Owner;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class AccountingRowMapper implements RowMapper<Accounting> {

        @Override
        public Accounting mapRow(ResultSet rs, int rowNum) throws SQLException {
            Accounting accounting = new Accounting();
            Car car = new Car();
            Owner owner = new Owner();
            accounting.setId(rs.getInt("ID"));

            //маппинг объекта owner
            owner.setFirstName(rs.getString("first_name"));
            owner.setSecondName(rs.getString("second_name"));
            owner.setLastName(rs.getString("last_name"));
            owner.setBirthday(rs.getDate("birthday"));
            accounting.setOwner(owner);

            //маппинг объекта car
            car.setBrand(rs.getString("brand"));
            car.setModel(rs.getString("model"));
            car.setGeneration(rs.getString("generation"));
            accounting.setCar(car);

            // маппинг оставшихся столбцов
            accounting.setReleaseYear(rs.getInt("release_year"));
            accounting.setRegNumber(rs.getString("reg_number"));
            accounting.setPts(rs.getLong("pts"));
            accounting.setPtsDate(rs.getDate("pts_date"));
            accounting.setSts(rs.getLong("sts"));
            accounting.setStsDate(rs.getDate("sts_date"));
            return accounting;
        }
}
