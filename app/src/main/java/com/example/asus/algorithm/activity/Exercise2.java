package com.example.asus.algorithm.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus.algorithm.R;

/**
 * Created by Administrator on 2018\1\11 0011.
 */

public class Exercise2 extends android.support.v4.app.Fragment{
    private TextView tv_topic;
    private RadioButton cb1;
    private RadioButton cb2;
    private RadioButton cb3;
    private RadioButton cb4;


    private RadioGroup radgroup;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.exercise2,container,false);

        tv_topic = (TextView) view.findViewById(R.id.topic);
        cb1 = (RadioButton) view.findViewById(R.id.cb1);
        cb2 = (RadioButton) view.findViewById(R.id.cb2);
        cb3 = (RadioButton) view.findViewById(R.id.cb3);
        cb4 = (RadioButton) view.findViewById(R.id.cb4);

        radgroup = (RadioGroup)view.findViewById(R.id.radioGroup);
        //为radioGroup设置一个监听器:setOnCheckedChanged()
        tv_topic.setText(" 将上万个一组无序并且互不相等的正整数序列，存放于顺序存储结构中，采用（    ）方法能够最快地找出其中最大的正整数。" );

        cb1.setText("快速排序");
        cb2.setText("插入排序");
        cb3.setText("选择排序 ");
        cb4.setText("归并排序");
        radgroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                // TODO Auto-generated method stub
                if(checkedId==cb3.getId())
                {
                    Toast.makeText(getActivity().getApplicationContext(), "回答正确！", Toast.LENGTH_SHORT).show();
                }else
                {
                    Toast.makeText(getActivity().getApplicationContext(), "回答错误1", Toast.LENGTH_SHORT).show();
                }
            }
        });
//        cb1.setOnClickListener(this);
//        cb2.setOnClickListener(this);
//        cb3.setOnClickListener(this);
//        cb4.setOnClickListener(this);
        return view;
    }


}
