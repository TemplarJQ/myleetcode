package graph;

import java.util.Scanner;//������ʹ����Scanner��

class Graph{
    //����һ�µ����Ա���
    private int vertexSize;//������������Ȼ��˽�еģ����ǿ�����set get������������
    //����1.eclipse����δʹ��vertexSize,ԭ����ʲô��

    private int [] vertex;//���嶥������
    private int [] [] matrix;//�����ڽӾ�����һ����ά����
    private static final int MAX=50;//�������Ȩ��50���������,����  ��Ϊ�Ǿ�̬˽�еĳ�����ֻ���ڱ�������Ч

    //ͼ��Ĺ��캯��
    public Graph(int vertexSize){
        this.vertexSize = vertexSize;//���մ����Ķ�����   ���ڽӾ���Ķ��崦����֪������������5
        matrix=new int [vertexSize] [vertexSize];//�ڽӾ����Ƿ��������Ƕ�����   
        //������������,��ʵ�����ö���������嶥�����飬���ն��������������0��1,2,3,4
        vertex=new int [vertexSize];
        for(int i=0;i<vertexSize;i++){
            vertex[i]=i;
        }
    }

    //����vertex��set get����   ��ݼ��� alt+shift+s
    public int[] getVertex() {
        return vertex;
    }

    public void setVertex(int[] vertex) {
        this.vertex = vertex;//���Ե���ͼ�������������ͼ�Ķ�������
    }

    //---����������
    public static void main(String[] args) {
        Graph graph = new Graph(5);//����һ��������ͼ����������5���������ڽӾ������ֵ
        //�����5�ѵ�������ʹ��vertexSize��
        int [] a1=new int[]{0,MAX,MAX,MAX,6};
        int [] a2=new int[]{9,0,3,MAX,MAX};
        int [] a3=new int[]{2,MAX,0,5,MAX};
        int [] a4=new int[]{0,MAX,MAX,0,1};
        int [] a5=new int[]{0,MAX,MAX,MAX,0};//����5��һά����

        //��ÿ�е����ݸ�ֵ��ͼ���ڽӾ���,�ڽӾ���ÿ�о���һ������
        graph.matrix[0]=a1;
        graph.matrix[1]=a2;
        graph.matrix[2]=a3;
        graph.matrix[3]=a4;
        graph.matrix[4]=a5;//�����ڽӾ��󴴽����

        //---ʹ������ķ�ʽ��ѯ��Ҫ���Ķ��㣬Ӧ�û������ж϶����Ƿ񳬳���Χ 
        System.out.println("��������鿴�Ķ��㣺");
        Scanner sc =new Scanner(System.in );
        int mm=0;
        if(sc.hasNext())
            mm=sc.nextInt();
        int num = graph.getOutDegree(mm);
        System.out.println("����"+mm+"�ĳ����ǣ�"+num);
        sc.close();
    }

    //����1����ȡĳ������ĳ��ȣ������ڽӾ�������������Ӧ�����д���0С������������
    public int getOutDegree(int index){
        int degree=0;//��ʼ������Ϊ0
        for(int j=0;j<matrix[index].length;j++){
            if(matrix[index][j]>0 & matrix[index][j]<MAX)
                degree++;
        }
        return degree;
    }
}
